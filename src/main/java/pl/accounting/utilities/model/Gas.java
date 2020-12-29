package pl.accounting.utilities.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Gas {

    @Column(name = "gas_prediction")
    private float prediction;
    @Column(name = "gas_quantity")
    private float quantity;
    @Column(name = "gas_advance")
    private BigDecimal advance;
    @Column(name = "gas_stake")
    private BigDecimal stake;


}
