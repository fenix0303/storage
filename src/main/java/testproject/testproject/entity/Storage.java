package testproject.testproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "storage")
@EqualsAndHashCode(callSuper = false, of = {"name"})
public class Storage extends BaseEntity {

    private String name;

    private String location;

    @OneToOne
    private Employee responsiblePerson;
}
