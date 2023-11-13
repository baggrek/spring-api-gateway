package id.userservice.controller;

import id.userservice.domain.dto.ResponseDto;
import id.userservice.domain.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "")
    public ResponseEntity<Object> getUser() {

        UserDto user = new UserDto();
        user.setId(1L);
        user.setName("Bruce Wayne");
        user.setEmail("brucewayne.corps@mail.com");
        user.setAge(30);

        ResponseDto response = new ResponseDto("SUCCESS", user);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
