package pl.accounting.utilities.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Heating {

    @Column(name = "heating_prediction")
    private float prediction;
    @Column(name = "heating_quantity")
    private float quantity;
    @Column(name = "heating_stake")
    private BigDecimal stake;


}
