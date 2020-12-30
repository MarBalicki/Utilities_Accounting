package pl.accounting.utilities.model;

import pl.accounting.utilities.dto.HeatingDto;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Heating implements Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "heating_prediction")
    private float prediction;
    @Column(name = "heating_quantity")
    private float quantity;
    @Column(name = "heating_stake")
    private BigDecimal stake;

    public static Heating apply(HeatingDto heatingDto) {
        Heating heating = new Heating();
        heating.prediction = Float.parseFloat(heatingDto.getPrediction());
        if (!heatingDto.getQuantity().equals("")) {
            heating.quantity = Float.parseFloat(heatingDto.getQuantity());
        }
        heating.stake = new BigDecimal(heatingDto.getStake());
        return heating;
    }

    @Override
    public BigDecimal getBalance() {
        return BigDecimal.valueOf(prediction).multiply(stake);
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

    public BigDecimal getStake() {
        return stake;
    }

    public void setStake(BigDecimal stake) {
        this.stake = stake;
    }
}
