package Entities;
import Enum.WorkerLeve;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLeve level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLeve level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLeve getLevel() {
        return level;
    }

    public void setLevel(WorkerLeve level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){ // quando receber o valor vai ser  adicionato o vvalor na lista
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){ // remove o contrato que foi passado da lista
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal  = Calendar.getInstance();
        for (HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_yaear =  cal.get(Calendar.YEAR
            );
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_yaear && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
