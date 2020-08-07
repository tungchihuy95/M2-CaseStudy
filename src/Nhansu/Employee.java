package Nhansu;

public class Employee {
    private String name;
    private String year;
    private String gender;
    private String phone;
    private String email;
    private String edu;
    private String position;
    private String wage;

    public Employee(String name, String year, String gender, String phone, String email, String edu, String position, String wage) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.edu = edu;
        this.position = position;
        this.wage = wage;
    }

//    public Employee(String name, String year, String gender, String phone, String email, String edu, String position, String wage) {
//        this.name = name;
//        this.year = year;
//        this.gender = gender;
//        this.phone = phone;
//        this.email = email;
//        this.edu = edu;
//        this.position = position;
//        this.wage = wage;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }
}
