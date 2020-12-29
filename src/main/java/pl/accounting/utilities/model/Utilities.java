package pl.accounting.utilities.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Entity
public class Utilities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private SimpleDateFormat date;
    private BigDecimal payment;
    private BigDecimal administrativeFee;
    private BigDecimal balance;
    @Embedded
    private Heating heating;
    @Embedded
    private Water water;
    @Embedded
    private Electricity electricity;
    @Embedded
    private Gas gas;
    @ManyToOne
    private Tenant tenant;

}
