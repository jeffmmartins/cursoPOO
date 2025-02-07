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
        Double anualIncome = getAnualIncome();
        Double healthexpenditures = getHealthExpenditures();
        if (anualIncome < 20000.00) {
            return (anualIncome * 0.15) - (healthexpenditures * 0.50);
        }else {
            return (anualIncome * 0.25) - (healthexpenditures * 0.50);
        }
    }
}
