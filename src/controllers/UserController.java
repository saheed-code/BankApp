package controllers;

import dto.requests.LoginRequest;
import dto.requests.RegisterRequest;
import dto.response.LoginResponse;
import dto.response.RegisterResponse;
import services.UserService;
import services.UserServiceImpl;

public class UserController {
    UserService userService = new UserServiceImpl();

    public RegisterResponse register(RegisterRequest registerRequest){
        return userService.createUser(registerRequest);
    }

    public LoginResponse login(LoginRequest loginRequest){
        return userService.login(loginRequest);
    }
}
