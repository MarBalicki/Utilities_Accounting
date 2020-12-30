package pl.accounting.utilities.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Gas implements Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "gas_prediction")
    private float prediction;
    @Column(name = "gas_quantity")
    private float quantity;
    @Column(name = "gas_advance")
    private BigDecimal advance;
    @Column(name = "gas_stake")
    private BigDecimal stake;


    @Override
    public BigDecimal getBalance() {
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPrediction() {
        return prediction;
    }

    public void setPrediction(float prediction) {
        this.prediction = prediction;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAdvance() {
        return advance;
    }

    public void setAdvance(BigDecimal advance) {
        this.advance = advance;
    }

    public BigDecimal getStake() {
        return stake;
    }

    public void setStake(BigDecimal stake) {
        this.stake = stake;
    }
}
