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
@Table(name = "buyer")
@EqualsAndHashCode(callSuper = false, of = {"name", "location"})
public class Buyer extends  BaseEntity {

    private String name;

    private String location;
}
