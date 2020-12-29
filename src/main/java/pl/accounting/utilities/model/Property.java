package pl.accounting.utilities.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Embedded
    private Address address;
    @Embedded
    private Owner owner;
    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Tenant> tenants;
}
