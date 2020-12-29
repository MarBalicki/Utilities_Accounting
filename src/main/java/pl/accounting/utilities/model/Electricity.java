package pl.accounting.utilities.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Electricity {

    @Column(name = "electricity_prediction")
    private float prediction;
    @Column(name = "electricity_quantity")
    private float quantity;
    @Column(name = "electricity_advance")
    private BigDecimal advance;
    @Column(name = "electricity_stake")
    private BigDecimal stake;


}
