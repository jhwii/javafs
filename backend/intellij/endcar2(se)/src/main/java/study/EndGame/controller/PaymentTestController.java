package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.EndGame.dto.CarRegistrationDto;
import study.EndGame.dto.toss.PaymentReq;
import study.EndGame.dto.toss.SimplePaymentResponse;
import study.EndGame.entity.User;
import study.EndGame.service.UserService;
import study.EndGame.service.car.CarService;
import study.EndGame.service.toss.PaymentService;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PaymentTestController {

    private final PaymentService paymentService;
    private final UserService userService;
    private final CarService carService;

    @GetMapping("/payment/buy/{carId}")
    public String getPaymentPage(Model model, Authentication auth, @PathVariable("carId") Long carId) {
        if(auth != null) {
            User loginUser = userService.getLoginUserByLoginId(auth.getName());
            if (loginUser != null) {
                model.addAttribute("nickname", loginUser.getNickname());
            }
        }
        CarRegistrationDto carRegistrationDto = carService.getCarDtl(carId);
        model.addAttribute("car", carRegistrationDto);

        return "/toss/buy";
    }

    @GetMapping("/payment/success")
    public ResponseEntity<SimplePaymentResponse> paymentSuccessTest(@RequestParam(name = "paymentKey") String paymentKey,
                                                                    @RequestParam(name = "orderId") String orderId,
                                                                    @RequestParam(name = "amount") int amount) throws Exception{
        log.info("paymentKey, orderId, amount is [{}],[{}],[{}]", paymentKey, orderId, amount);
        PaymentReq paymentReq = PaymentReq.make(paymentKey, orderId, amount);


        return ResponseEntity.ok().body(paymentService.paymentTest(paymentReq));

    }
}
