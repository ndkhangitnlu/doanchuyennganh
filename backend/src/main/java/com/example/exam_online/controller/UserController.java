package com.example.exam_online.controller;

import com.example.exam_online.dto.UserDto;
import com.example.exam_online.entity.User;
import com.example.exam_online.exception.CustomException;
import com.example.exam_online.response.ResponseHandler;
import com.example.exam_online.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/findUser/{userId}")
    public ResponseHandler<UserDto> findUserById(@PathVariable int userId) throws CustomException {
        User user = userService.findById(userId);
        UserDto userDto = mapper.map(user, UserDto.class);
        ResponseHandler<UserDto> responseHandler = new ResponseHandler<UserDto>("successfully found user",
                                                                                HttpStatus.OK.value(), userDto);
        return responseHandler;
    }
<<<<<<< Updated upstream
=======

    @PostMapping("/login")
    public ResponseHandler<String> authenticateUser(@RequestBody LoginRequest loginRequest) {
        System.out.println("login");
        // Valid username and password.
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        // If don't catch exception that mean this is valid information
        // Set infor authentication into Security Context
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Return jwt for user.
        String jwt = tokenProvider.generateToken((CustomUserDetails) authentication.getPrincipal());
        return new ResponseHandler<>("successfully logged in", HttpStatus.OK.value(), jwt);
    }
>>>>>>> Stashed changes
}
