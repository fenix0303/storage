package testproject.testproject.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserData {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
