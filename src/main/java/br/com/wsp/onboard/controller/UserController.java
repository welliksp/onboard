package br.com.wsp.onboard.controller;

import br.com.wsp.onboard.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<Integer> save() {

        Integer result = soma(10, 24);

        return ResponseEntity.ok(result);
    }

    private Integer soma(Integer num1, Integer num2) {

        return num1 + num2;
    }
}
