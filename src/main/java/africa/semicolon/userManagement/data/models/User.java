package africa.semicolon.userManagement.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;

@Setter
@Getter
@NoArgsConstructor
@Document("Users")

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phoneNumber;
    private String password;

}
