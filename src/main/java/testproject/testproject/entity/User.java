package testproject.testproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user")
@EqualsAndHashCode(callSuper = false, of = {"email"})
public class User extends BaseEntity {

    private String email;

    private String password;

    private String firstName;

    private String lastName;
}
