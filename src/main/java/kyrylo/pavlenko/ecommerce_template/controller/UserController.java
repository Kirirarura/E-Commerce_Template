package kyrylo.pavlenko.ecommerce_template.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
@Slf4j
public class UserController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
       return ResponseEntity.ok("Hello!!!");
    }
}
