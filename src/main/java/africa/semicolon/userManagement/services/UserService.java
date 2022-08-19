package africa.semicolon.userManagement.services;

import africa.semicolon.userManagement.dtos.requests.RegisterUserRequest;
import africa.semicolon.userManagement.dtos.responses.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);
}
