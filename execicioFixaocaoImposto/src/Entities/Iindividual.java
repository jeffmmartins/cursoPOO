package Entities;

public class Iindividual extends TaxPayer{
    private Double healthExpenditures;

    public Iindividual(){}

    public Iindividual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax(){
        return 0.0;
    }

}
