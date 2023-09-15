package study.EndGame.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.EndGame.dto.toss.PaymentReq;
import study.EndGame.dto.toss.SimplePaymentResponse;
import study.EndGame.service.toss.PaymentService;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PaymentTestController {

    private final PaymentService paymentService;

    @GetMapping("/payment/buy")
    public String getPaymentPage() {
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
