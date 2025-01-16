package br.com.wsp.onboard.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {


    @InjectMocks
    UserController controller;

    @Test
    void test__sumTwoNumbers__shouldReturnSucess() {

        ResponseEntity<Integer> result = controller.save();

        Integer body = result.getBody();

        assertEquals(body, 34);

    }

}