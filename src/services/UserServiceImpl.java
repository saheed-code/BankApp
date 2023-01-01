package services;

import data.model.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImpl;
import dto.requests.LoginRequest;
import dto.requests.RegisterRequest;
import dto.response.LoginResponse;
import dto.response.RegisterResponse;
import utils.ModelMapper;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository = new UserRepositoryImpl();
    private ModelMapper modelMapper;

    @Override
    public RegisterResponse createUser(RegisterRequest registerRequest) {
        if (userRepository.findByEmail(registerRequest.getEmail()) != null) throw new IllegalArgumentException("");

        User user = modelMapper.map(registerRequest);
        User savedUser = userRepository.save(user);

        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setFirstName(savedUser.getFirstName());
        registerResponse.setLastName(savedUser.getLastName());
        registerResponse.setMessage("Registration Successful, welcome to our bank");

        return registerResponse;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        if(!loginRequest.getPassword().equals(loginRequest.getConfirmPassword())) {
            throw new IllegalArgumentException("");
        }

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setMessage("Login Successful");
        return loginResponse;
    }

    @Override
    public List<User> viewAll() {
        return userRepository.findAll();
    }

    private User validateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if(user != null && user.getPassword().equals(email))  return user;
        return null;
    }
}
