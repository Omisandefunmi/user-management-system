package africa.semicolon.userManagement.services;

import africa.semicolon.userManagement.data.repositories.UserRepository;
import africa.semicolon.userManagement.dtos.requests.RegisterUserRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
@Autowired
private UserService userService;
@Autowired
private UserRepository userRepository;

private RegisterUserRequest registerUserRequest;
    @BeforeEach
    void setUp() {
        registerUserRequest = RegisterUserRequest.builder()
                .email("lammy@mail.com")
                .firstName("olu")
                .lastName("kanbi")
                .phoneNumber("909878")
                .password("0000")
                .build();
    }

    @AfterEach
    void tearDown() {
        userRepository.deleteAll();
    }

    @Test
    public void userServiceCanRegisterTest(){
        userService.registerUser(registerUserRequest);
        assertEquals(1, userRepository.count());
    }
}