package testproject.testproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "supplier")
@EqualsAndHashCode(callSuper = false, of = {"name", "location"})
public class Supplier extends  BaseEntity {

    private String name;

    private String location;

    @ManyToMany
    @JoinTable(name="supplier_product", joinColumns = @JoinColumn(name="supplier_id"), inverseJoinColumns = @JoinColumn(name="product_id"))
    private Set<Product> products = new HashSet<>();
}
