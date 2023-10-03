package ie.atu.helloworldspringboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class RequestController {
    @GetMapping("greet/{name}")
    public String storycuz(@PathVariable String name) {
        return "Hello, " + name;
    }
    @GetMapping("/details")
    public String storycuz(@RequestParam String name , int age) {
        return "Name : age," + age + name;
    }
}
