package testproject.testproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import testproject.testproject.enumeration.ProductType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
@EqualsAndHashCode(callSuper = false, of = {"name"})
public class Product extends BaseEntity {

    private String name;

    private Long amount;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    @ManyToMany
    @JoinTable(name="supplier_product", joinColumns = @JoinColumn(name="product_id"), inverseJoinColumns = @JoinColumn(name="supplier_id"))
    private Set<Supplier> suppliers = new HashSet<>();
}
