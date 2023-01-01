package utils;

import data.model.User;
import dto.requests.RegisterRequest;

public class ModelMapper {
    public User map(RegisterRequest registerRequest){
        return new User(
                registerRequest.getFirstName(),
                registerRequest.getLastName(),
                registerRequest.getPhoneNumber(),
                registerRequest.getEmail(),
                registerRequest.getPassword(),
                registerRequest.getDateOfBirth()
        );
    }
}
