public class funcionarios{
    private int id;
    private String nome;
    private double salary;
    public funcionarios(int id, String nome, double salary){
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        salary+=salary*percentage/100.0;
    }
    public String toString(){
        return id+ ","+nome+","+ String.format("%.2f", salary);
    }
}