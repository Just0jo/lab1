package ie.atu.helloworldspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate /{numb1}/{numb2}/(operation}")
    public Solution calculate(@PathVariable int numb1, @PathVariable int numb2, @PathVariable String operation){
        if (operation == "add") {
            return new Solution(operation, numb1 + numb2);
        }
        if (operation == "subtract") {
            return new Solution(operation, numb1 - numb2);
        }
        if (operation == "multiply"){
            return new Solution(operation, numb1 * numb2);
        }
        if (operation == "divide") {
            return new Solution(operation, numb1 / numb2);
        }
        return new Solution("",0);

        }
    }




