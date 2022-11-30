package utils;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegexPerson {
    static Scanner scanner = new Scanner(System.in);
    List<Employee> employeeList = new ArrayList<>();

    public static int inputId() {
        System.out.print("Nhap Id: ");
        while (true) {
            try {
                int id = Integer.parseInt(scanner.nextLine());
                return id;
            } catch (NumberFormatException e) {
                System.out.print("Khong hop le! Nhap lai Id: ");
            }
        }
    }

    public static String inputName() {
        System.out.print("Enter new employee full name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String inputDateOfBirth() {
        System.out.print("Enter date of birth: ");
        String dateOfBirth = scanner.nextLine();
        return dateOfBirth;
    }

    public static String inputGender() {
        System.out.println("Enter gender: ");
        System.out.println("1 --> Male");
        System.out.println("2 --> Female");

        while (true) {
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                return "Male";
            } else if (choice.equals("2")) {
                return "Female";
            } else {
                System.out.println("Invalid! ");
            }
        }
    }

    public static String inputIdentityCard() {
        System.out.print("Enter Identity Card: ");
        return scanner.nextLine();
    }

    public static String inputPhoneNumber() {
        System.out.print("Enter Phone Number: ");
        return scanner.nextLine();
    }


    public static String inputEmail() {
        System.out.println("Mời Bạn Nhập Email :");
        return scanner.nextLine();
    }

    public static String inputPosition() {
        System.out.println("Chức Vụ Bạn Hiện Tại Là Gì");
        System.out.println("1.Receptionist");
        System.out.println("2.Waiter");
        System.out.println("3.Specialist");
        System.out.println("4.Supervisor");
        System.out.println("5.Manager");
        System.out.println("6.Director");
        while (true) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return "Receptionist";
                case "2":
                    return "Waiter";
                case "3":
                    return "Specialist";
                case "4":
                    return "Supervisor";
                case "5":
                    return "Manager";
                case "6":
                    return "Director";
                default:
                    System.out.println("invalid!");
            }
        }
    }

    public static String inputLevel() {
        System.out.println("Mời Bạn Chọn Trình Độ Học Vấn :");
        System.out.println("1.Trung Cấp");
        System.out.println("2.Cao Đẳng");
        System.out.println("3.Đại Học");
        System.out.println("4.Sau Đại Học");
        String choice;
        while (true) {
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return "Intermediate Degree";
                case "2":
                    return "College";
                case "3":
                    return "University";
                case "4":
                    return "Postgraduate";
                default:
                    System.out.println("Invalid! ");
            }
        }
    }

    public static Double inputSalary() {
        double salary;
        System.out.println("Mời Bạn Nhập Mức Lương:");
        while (true) {
            try {
                salary = Double.parseDouble(scanner.nextLine());
                return salary;
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Input a salary again: ");
            }
        }
    }

    public static String inputCustomerType() {
        System.out.println("Mời Bạn Chọn Loại Khách Hàng :");
        System.out.println("1.Diamond");
        System.out.println("2.Platinum");
        System.out.println("3.Gold");
        System.out.println("4.Silver");
        System.out.println("5.Member");
        while (true) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return "Diamond";
                case "2":
                    return "Platinum";
                case "3":
                    return "Gold";
                case "4":
                    return "Silver";
                case "5":
                    return "Member";
                default:
                    System.out.println("Invalid! ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(inputCustomerType());
    }
}
