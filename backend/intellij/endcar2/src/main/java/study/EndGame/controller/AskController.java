package study.EndGame.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import study.EndGame.dto.AskCommentDto;
import study.EndGame.dto.AskDto;
import study.EndGame.service.AskCommentService;
import study.EndGame.service.AskService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ask")
public class AskController {

    private final AskService askService;
    private final AskCommentService askCommentService;

    @GetMapping("/list")
    public String findAll(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "keyword", required = false) String keyword,
            Model model
    ) {
        int pageSize = 12;
        Pageable pageable = PageRequest.of(page - 1, pageSize, Sort.by("id").descending());

        Page<AskDto> askDtoPage;
        if (keyword != null && !keyword.isEmpty()) {
            askDtoPage = askService.search(keyword, pageable);
        } else {
            askDtoPage = askService.findAll(pageable);
        }

        model.addAttribute("askList", askDtoPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", askDtoPage.getTotalPages());
        model.addAttribute("isFirstPage", page == 1);
        model.addAttribute("isLastPage", page == askDtoPage.getTotalPages());
        model.addAttribute("keyword", keyword); // 검색어를 뷰로 전달

        return "/ask/list";
    }


    @GetMapping("/post")
    public String post() {
        return "/ask/post";
    }

    @PostMapping("/post")
    public String postSave(@ModelAttribute AskDto askDto) {
        askService.save(askDto);
        return "redirect:/ask/list";
    }

    @GetMapping("list/{id}")
    public String findById(@PathVariable(value = "id") Long id, Model model,
                           @PageableDefault(page = 1) Pageable pageable,
                           HttpServletRequest request) {

        HttpSession session = request.getSession();
        String sessionKey = "ask_" + id;

        if (session.getAttribute(sessionKey) == null) {
            // 세션에 조회 여부가 없으면 조회수 증가 및 세션에 기록
            askService.updateHits(id);
            session.setAttribute(sessionKey, true);

        }

        AskDto askDto = askService.findById(id);

        /* 댓글 목록 가져오기 */
        List<AskCommentDto> askCommentDtoList = askCommentService.findAll(id);
        model.addAttribute("commentList", askCommentDtoList);
        model.addAttribute("ask", askDto);
        model.addAttribute("page", pageable.getPageNumber());
        return "/ask/detail";
    }

//    @GetMapping("list/{id}")
//    public String findById(@PathVariable(value = "id") Long id, Model model,
//                           @PageableDefault(page = 1) Pageable pageable,
//                           HttpServletRequest request) {
//
//    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        AskDto askDto = askService.findById(id);
        model.addAttribute("askUpdate", askDto);
        return "ask/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute AskDto askDto, Model model) {
        AskDto askDto1 = askService.update(askDto);
        model.addAttribute("ask", askDto1);
        return "redirect:/ask/list/" + askDto.getId();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        askService.delete(id);
        return "redirect:/ask/list";
    }




}