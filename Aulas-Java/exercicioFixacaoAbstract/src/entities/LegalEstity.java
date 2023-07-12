package entities;

public class LegalEstity extends Person {
    private Integer numberEmployees;

    public  LegalEstity(){}

    public LegalEstity(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double taxesPaid() {
        Double taxes= 0.0;
        if (numberEmployees >= 10){
           taxes = getAnnualIncome() * 0.14;
        }else {
            taxes = getAnnualIncome() * 0.16;
        }
        return taxes;
    }


}
