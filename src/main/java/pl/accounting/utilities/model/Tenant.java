package pl.accounting.utilities.model;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Set;

@Entity
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Person tenant;
    @ManyToOne
    private Property property;
    private SimpleDateFormat leaseStart;
    private SimpleDateFormat leaseEnd;
    private boolean current;
    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Utilities> utilitiesSet;

}