package pl.accounting.utilities.dto;

import pl.accounting.utilities.model.Utilities;

public class UtilitiesDto {

    private Long id;
    private String date;
    private String payment;
    private String administrativeFee;
    private String balance;
    private String heatingPrediction;
    private String heatingStake;
    private String heatingQuantity;
    private String heatingBalance;
    private String coldWaterPrediction;
    private String hotWaterPrediction;
    private String coldWaterStake;
    private String hotWaterStake;
    private String coldWaterQuantity;
    private String hotWaterQuantity;
    private String waterBalance;
    private String electricityAdvance;
    private String electricityPrediction;
    private String electricityStake;
    private String electricityQuantity;
    private String electricityBalance;
    private String gasAdvance;
    private String gasPrediction;
    private String gasStake;
    private String gasQuantity;
    private String gasBalance;
    private String tenantName;


    public static UtilitiesDto apply(Utilities utilities) {
        UtilitiesDto utilitiesDto = new UtilitiesDto();
        utilitiesDto.setId(utilities.getId());
        utilitiesDto.setDate(utilities.getDate().toString());
        utilitiesDto.setPayment(String.valueOf(utilities.getPayment()));
        utilitiesDto.setAdministrativeFee(String.valueOf(utilities.getAdministrativeFee()));
//        utilitiesDto.setBalance(String.valueOf(utilities.getBalance()));
//        utilitiesDto.setHeatingBalance(String.valueOf(utilities.getHeating().getBalance()));
//        utilitiesDto.setWaterBalance(String.valueOf(utilities.getWater().getBalance()));
//        utilitiesDto.setElectricityBalance(String.valueOf(utilities.getElectricity().getBalance()));
//        utilitiesDto.setGasBalance(String.valueOf(utilities.getGas().getBalance()));
        utilitiesDto.setTenantName(utilities.getTenant().getFirstName()
                + " " + utilities.getTenant().getLastName());
        return utilitiesDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAdministrativeFee() {
        return administrativeFee;
    }

    public void setAdministrativeFee(String administrativeFee) {
        this.administrativeFee = administrativeFee;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getHeatingPrediction() {
        return heatingPrediction;
    }

    public void setHeatingPrediction(String heatingPrediction) {
        this.heatingPrediction = heatingPrediction;
    }

    public String getHeatingStake() {
        return heatingStake;
    }

    public void setHeatingStake(String heatingStake) {
        this.heatingStake = heatingStake;
    }

    public String getHeatingQuantity() {
        return heatingQuantity;
    }

    public void setHeatingQuantity(String heatingQuantity) {
        this.heatingQuantity = heatingQuantity;
    }

    public String getHeatingBalance() {
        return heatingBalance;
    }

    public String getColdWaterPrediction() {
        return coldWaterPrediction;
    }

    public void setColdWaterPrediction(String coldWaterPrediction) {
        this.coldWaterPrediction = coldWaterPrediction;
    }

    public String getHotWaterPrediction() {
        return hotWaterPrediction;
    }

    public void setHotWaterPrediction(String hotWaterPrediction) {
        this.hotWaterPrediction = hotWaterPrediction;
    }

    public String getColdWaterStake() {
        return coldWaterStake;
    }

    public void setColdWaterStake(String coldWaterStake) {
        this.coldWaterStake = coldWaterStake;
    }

    public String getHotWaterStake() {
        return hotWaterStake;
    }

    public void setHotWaterStake(String hotWaterStake) {
        this.hotWaterStake = hotWaterStake;
    }

    public String getColdWaterQuantity() {
        return coldWaterQuantity;
    }

    public void setColdWaterQuantity(String coldWaterQuantity) {
        this.coldWaterQuantity = coldWaterQuantity;
    }

    public String getHotWaterQuantity() {
        return hotWaterQuantity;
    }

    public void setHotWaterQuantity(String hotWaterQuantity) {
        this.hotWaterQuantity = hotWaterQuantity;
    }

    public void setHeatingBalance(String heatingBalance) {
        this.heatingBalance = heatingBalance;
    }

    public String getWaterBalance() {
        return waterBalance;
    }

    public void setWaterBalance(String waterBalance) {
        this.waterBalance = waterBalance;
    }


    public String getElectricityAdvance() {
        return electricityAdvance;
    }

    public void setElectricityAdvance(String electricityAdvance) {
        this.electricityAdvance = electricityAdvance;
    }

    public String getElectricityPrediction() {
        return electricityPrediction;
    }

    public void setElectricityPrediction(String electricityPrediction) {
        this.electricityPrediction = electricityPrediction;
    }

    public String getElectricityStake() {
        return electricityStake;
    }

    public void setElectricityStake(String electricityStake) {
        this.electricityStake = electricityStake;
    }

    public String getElectricityQuantity() {
        return electricityQuantity;
    }

    public void setElectricityQuantity(String electricityQuantity) {
        this.electricityQuantity = electricityQuantity;
    }

    public String getElectricityBalance() {
        return electricityBalance;
    }

    public void setElectricityBalance(String electricityBalance) {
        this.electricityBalance = electricityBalance;
    }

    public String getGasAdvance() {
        return gasAdvance;
    }

    public void setGasAdvance(String gasAdvance) {
        this.gasAdvance = gasAdvance;
    }

    public String getGasPrediction() {
        return gasPrediction;
    }

    public void setGasPrediction(String gasPrediction) {
        this.gasPrediction = gasPrediction;
    }

    public String getGasStake() {
        return gasStake;
    }

    public void setGasStake(String gasStake) {
        this.gasStake = gasStake;
    }

    public String getGasQuantity() {
        return gasQuantity;
    }

    public void setGasQuantity(String gasQuantity) {
        this.gasQuantity = gasQuantity;
    }

    public String getGasBalance() {
        return gasBalance;
    }

    public void setGasBalance(String gasBalance) {
        this.gasBalance = gasBalance;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
}
