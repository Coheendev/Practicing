package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); // NÃO USAR list no construtor, apenas starta a list com new array list

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double salary, Department department) {
        this.name = name;
        this.level = level;
        baseSalary  = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalary() {
        return baseSalary ;
    }

    public void setSalary(Double salary) {
        baseSalary = salary;
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

    public void addContract (HourContract contract) {
        contracts.add(contract);
    }
    public void removeContract (HourContract contract){
        contracts.remove(contract);
    }
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance(); // INSTANCIANDO um calendário com a data atual.
        for(HourContract c : contracts){
            cal.setTime(c.getDate()); // Pegando a data do contrato(getDate) e definindo(setTime) essa data como a data do calendário.
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); // +1 pq o month do calendar começa com 0
            if (year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
