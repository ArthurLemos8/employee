public class Salary {
    String name;
    double GroosSalary;
    double tax;
    public double netSalary(){
        return GroosSalary - tax;
    }

    public double increaseSalary(double porcentage){
        return GroosSalary += GroosSalary*porcentage/100;
    }

    public String toString(){
        return name + ", $"+ String.format("%.2f", netSalary());
    }
    
}
