package pl.accounting.utilities.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Water implements Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float coldPrediction;
    private float hotPrediction;
    private float coldQuantity;
    private float hotQuantity;
    private BigDecimal coldStake;
    private BigDecimal hotStake;

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

    public float getColdPrediction() {
        return coldPrediction;
    }

    public void setColdPrediction(float coldPrediction) {
        this.coldPrediction = coldPrediction;
    }

    public float getHotPrediction() {
        return hotPrediction;
    }

    public void setHotPrediction(float hotPrediction) {
        this.hotPrediction = hotPrediction;
    }

    public float getColdQuantity() {
        return coldQuantity;
    }

    public void setColdQuantity(float coldQuantity) {
        this.coldQuantity = coldQuantity;
    }

    public float getHotQuantity() {
        return hotQuantity;
    }

    public void setHotQuantity(float hotQuantity) {
        this.hotQuantity = hotQuantity;
    }

    public BigDecimal getColdStake() {
        return coldStake;
    }

    public void setColdStake(BigDecimal coldStake) {
        this.coldStake = coldStake;
    }

    public BigDecimal getHotStake() {
        return hotStake;
    }

    public void setHotStake(BigDecimal hotStake) {
        this.hotStake = hotStake;
    }
}
