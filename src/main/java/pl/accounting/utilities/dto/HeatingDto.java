package pl.accounting.utilities.dto;

public class HeatingDto {

    private Long id;
    private String prediction;
    private String quantity;
    private String stake;

    public HeatingDto() {
    }

    public HeatingDto(String prediction, String stake, String quantity) {
        this.prediction = prediction;
        this.stake = stake;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStake() {
        return stake;
    }

    public void setStake(String stake) {
        this.stake = stake;
    }
}
