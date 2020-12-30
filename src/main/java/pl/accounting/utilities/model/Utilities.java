package pl.accounting.utilities.model;

import pl.accounting.utilities.dto.HeatingDto;
import pl.accounting.utilities.dto.UtilitiesDto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Utilities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;
    private BigDecimal payment;
    private BigDecimal administrativeFee;
    private BigDecimal balance;
    @OneToOne(cascade = CascadeType.ALL)
    private Heating heating;
    @OneToOne(cascade = CascadeType.ALL)
    private Water water;
    @OneToOne(cascade = CascadeType.ALL)
    private Electricity electricity;
    @OneToOne(cascade = CascadeType.ALL)
    private Gas gas;
    @ManyToOne(fetch = FetchType.LAZY)
    private Tenant tenant;

    public static Utilities apply(UtilitiesDto utilitiesDto) {
        Utilities utilities = new Utilities();
        utilities.date = LocalDate.parse(utilitiesDto.getDate());
        utilities.payment = new BigDecimal(utilitiesDto.getPayment());
        utilities.administrativeFee = new BigDecimal(utilitiesDto.getAdministrativeFee());
        utilities.heating = Heating
                .apply(new HeatingDto(
                        utilitiesDto.getHeatingPrediction(),
                        utilitiesDto.getHeatingStake(),
                        utilitiesDto.getHeatingQuantity()));
        //todo add utilities ass above
        return utilities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public BigDecimal getAdministrativeFee() {
        return administrativeFee;
    }

    public void setAdministrativeFee(BigDecimal administrativeFee) {
        this.administrativeFee = administrativeFee;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Heating getHeating() {
        return heating;
    }

    public void setHeating(Heating heating) {
        this.heating = heating;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Electricity getElectricity() {
        return electricity;
    }

    public void setElectricity(Electricity electricity) {
        this.electricity = electricity;
    }

    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
