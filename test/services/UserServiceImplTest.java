package services;

import data.model.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImpl;
import dto.requests.LoginRequest;
import dto.requests.RegisterRequest;
import dto.response.LoginResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    private UserService userService;
    private UserRepository userRepository;

    @BeforeEach void setUp(){
        userService = new UserServiceImpl();
        userRepository = new UserRepositoryImpl();
    }

    @Test void canCreateUserTest(){
        RegisterRequest firstUser = new RegisterRequest("ogidiolu@gmail.com", "password",
                "Saheed", "Ajayi", "007", "13-12-93");
        userService.createUser(firstUser);

        assertEquals(1, userService.viewAll().size());
    }

    @Test void userCanLoginTest(){
        RegisterRequest firstUser = new RegisterRequest("ogidiolu@gmail.com", "password",
                "Saheed", "Ajayi", "007", "13-12-93");
        userService.createUser(firstUser);

        LoginRequest firstUserLogin = new LoginRequest("ogidiolu@gmail.com", "password", "password");
        LoginResponse login = userService.login(firstUserLogin);

        assertEquals("Login Successful", userService.login(firstUserLogin));

    }

}