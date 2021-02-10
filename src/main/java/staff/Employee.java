package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }
    public double payBonus(){
        return this.salary * 0.01;
    }
}
