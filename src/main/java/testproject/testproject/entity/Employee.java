package testproject.testproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
@EqualsAndHashCode(callSuper = false, of = {"individualNumber", "firstName", "lastName"})
public class Employee extends BaseEntity {

    private String firstName;

    private String lastName;

    private String individualNumber;

    private String position;

    private LocalDateTime dateOfHire;
}
