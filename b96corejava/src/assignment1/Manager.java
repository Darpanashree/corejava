package assignment1;


/**
 * Represents a manager, a type of employee with an additional attribute for the department managed.
 */
public class Manager extends Employee {
    // Additional attribute specific to Manager
    private String department;

    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    // Getter and Setter for the additional attribute
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
