package models;

public class Employee extends Person {
    private int employeeID;
    private String level;
    private String position;
    private double salary;
   /*
    private final String LEVEL_I = "Intermediate Degree";
    private final String LEVEL_II = "College";
    private final String LEVEL_III = "University";
    private final String LEVEL_IV = "Postgraduate";

    private final String POSITION_I = "Receptionist";
    private final String POSITION_II = "Waiter";
    private final String POSITION_III = "Specialist";
    private final String POSITION_IV = "Supervisor";
    private final String POSITION_V = "Manager";
    private final String POSITION_VI = "Director";
                                                     */

    public Employee() {
        super();
    }

    public Employee(int employeeID, String fullName, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String level, String position, double salary) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                ", gender=" + super.isGender() +
                ", identityCard='" + super.getIdentityCard() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }


}
