package models;

public class Customer extends Person {
    private int customerID;
    private String customerType;
    private String address;
    /*
    private final String CUSTOMER_TYPE_I = "Diamond";
    private final String CUSTOMER_TYPE_II = "Platinum";
    private final String CUSTOMER_TYPE_III = "Gold";
    private final String CUSTOMER_TYPE_IV = "Silver";
    private final String CUSTOMER_TYPE_V = "Member";  */

    public Customer() {
        super();
    }

    public Customer(int customerID, String fullName, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        super(fullName, dateOfBirth, gender, idCard, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ",customerID='" + customerID + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                ", gender=" + super.isGender() +
                ", identityCard='" + super.getIdentityCard() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
