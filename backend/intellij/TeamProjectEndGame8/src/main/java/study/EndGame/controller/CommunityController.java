package study.EndGame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import study.EndGame.dto.CommunityDto;
import study.EndGame.service.CommunityService;

import java.util.List;

@Controller
@RequestMapping("/security-login")
public class CommunityController {

    private CommunityService communityService;

    public CommunityController(CommunityService communityService) {
        this.communityService = communityService;
    }
    @GetMapping(value = {"community"})
    public String community(Model model){
        List<CommunityDto> communityDtoList = communityService.getCommunnityList();
        model.addAttribute("postList", communityDtoList);
        return "community/community";
    }

    @GetMapping(value = {"post"})
    public String post(){
        return "community/post";
    }

    @PostMapping("post")
    public String write(CommunityDto communityDto) {
        communityService.savePost(communityDto);
        return "redirect:/security-login/community";
    }
}
