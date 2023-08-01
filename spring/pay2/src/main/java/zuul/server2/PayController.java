package zuul.server2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping
public class PayController {
    @RequestMapping("/bpp1/{num}")
    public String bpp1(@PathVariable("num") int num) {
        System.out.println("num : " + num);
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "결제 완료";
    }
}
