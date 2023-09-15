package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import study.EndGame.dto.AskCommentDto;
import study.EndGame.dto.AskDto;
import study.EndGame.service.AskCommentService;
import study.EndGame.service.AskService;


import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ask")
public class AskCommentController {

    private final AskCommentService askCommentService;
    private final AskService askService;
    @PostMapping("/list/{id}")
    public ResponseEntity save(@ModelAttribute AskCommentDto askCommentDto,
                               @PathVariable Long id) {
        Long saveResult = askCommentService.save(askCommentDto);
        AskDto askDto = askService.findById(id);
        if (saveResult != null) {
            List<AskCommentDto> askCommentDTOList = askCommentService.findAll(askCommentDto.getAskId());
            return new ResponseEntity<>(askCommentDTOList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("해당 게시글이 존재하지 않습니다.", HttpStatus.NOT_FOUND);
        }
    }

}
