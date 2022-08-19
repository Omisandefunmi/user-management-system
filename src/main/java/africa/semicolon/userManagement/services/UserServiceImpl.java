package africa.semicolon.userManagement.services;

import africa.semicolon.userManagement.data.models.User;
import africa.semicolon.userManagement.data.repositories.UserRepository;
import africa.semicolon.userManagement.dtos.requests.RegisterUserRequest;
import africa.semicolon.userManagement.dtos.responses.RegisterUserResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
        User user = new User();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(registerUserRequest, user);
        User savedUser = userRepository.save(user);

        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setMessage("Success");
        return registerUserResponse;
    }
}
