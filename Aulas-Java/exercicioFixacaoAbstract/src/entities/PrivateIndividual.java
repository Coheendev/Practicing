package entities;

public class PrivateIndividual extends Person {
    private Double healthCare;

    public PrivateIndividual() {
    }

    public PrivateIndividual(String name, Double annualIncome, Double healthCare) {
        super(name, annualIncome);
        this.healthCare = healthCare;
    }

    public Double getHealthCare() {
        return healthCare;
    }

    public void setHealthCare(Double healthCare) {
        this.healthCare = healthCare;
    }

    @Override
    public Double taxesPaid() {
        Double taxes = 0.0;
        if (getAnnualIncome() < 20000.00){
            taxes = getAnnualIncome() * 0.15 - healthCare * 0.50;
        }else {
            taxes = getAnnualIncome() * 0.25 - healthCare * 0.50;
        }
        return taxes;
    }
}
