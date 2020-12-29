package pl.accounting.utilities.model;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Water {

    private float coldPrediction;
    private float hotPrediction;
    private float coldQuantity;
    private float hotQuantity;
    private BigDecimal coldStake;
    private BigDecimal hotStake;


}
