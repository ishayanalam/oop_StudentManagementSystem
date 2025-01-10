package sms.classes;

import java.time.LocalDate;

public abstract class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String advisor;
    private String degree;
    private String gender;
    private LocalDate DateOfBirth;
    private String password;

    public Student(String name, String email, String phone, String address, String advisor, String degree, String gender, LocalDate dob, String password) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.advisor = advisor;
        this.degree = degree;
        this.gender = gender;
        this.DateOfBirth = dob;
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return DateOfBirth;
    }

    public void setDob(LocalDate dob) {
        this.DateOfBirth = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public abstract boolean saveDatabase();
}
