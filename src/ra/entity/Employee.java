package ra.entity;

import java.util.Scanner;

public class Employee {
    protected  int empId;
    protected  String empName;
    protected  String birthYear;
    protected  String phone;
    protected  String email;
    protected  boolean empStatus;

    public Employee() {
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(boolean empStatus) {
        this.empStatus = empStatus;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public Employee(int empId, String empName, String birthYear, String phone, String email, boolean empStatus) {
        this.empId = empId;
        this.empName = empName;
        this.birthYear = birthYear;
        this.phone = phone;
        this.email = email;
        this.empStatus = empStatus;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void inputData(){
        Scanner scanner =new Scanner(System.in);
        // input
    }
    public void displayData(){

    }
}
