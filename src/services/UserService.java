package services;

import data.model.User;
import dto.requests.LoginRequest;
import dto.requests.RegisterRequest;
import dto.response.LoginResponse;
import dto.response.RegisterResponse;

import java.util.List;

public interface UserService {
    RegisterResponse createUser(RegisterRequest registerRequest);
    LoginResponse login(LoginRequest loginRequest);
    List<User> viewAll();

}
