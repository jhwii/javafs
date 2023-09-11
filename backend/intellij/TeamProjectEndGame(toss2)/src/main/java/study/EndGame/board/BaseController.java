package study.EndGame.board;//package study.EndGame.board;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import study.EndGame.entity.User;
//
//
//import javax.servlet.http.HttpSession;
//
//@RequiredArgsConstructor
//@Controller
//public class BaseController {
//
//    private final HttpSession httpSession;
//
//    @GetMapping({"", "/list"})
//    public String index(Model model) {
//
//        User user = (User) httpSession.getAttribute("user");
//
//        if (user != null) {
//            model.addAttribute("userName", user.getName());
//            model.addAttribute("userImg", user.getPicture());
//        }
//
//        return "redirect:/board/list";
//    }
//}