package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NI, double salary){
        super(name, NI, salary);
        this.deptName = deptName;
    }
}
