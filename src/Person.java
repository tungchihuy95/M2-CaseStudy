import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee1 {
    private int id;
    private String name;
    private LocalDate year;
    private int age;
    private String gender;
    private String from;
    private String phone;
    private String email;
    private String edu;
    private String dept;
    private String wage;


    private DepartmentEnum department;

    public Employee1() {

    }

    public Employee1(int id, String name, LocalDate year, String gender, String from, String phone, String email, String edu, String dept, String wage) {
        this.id = id;
        this.name = name;
        this.year = year;
//        this.age = age;
        this.gender = gender;
        this.from = from;
        this.phone = phone;
        this.email = email;
        this.edu = edu;
        this.dept = dept;
        this.wage = wage;
    }

    public Employee1(int id, String name, String year, String gender, String from, String phone, String email, String edu, String dept, String wage) {
        this.id = id;
        this.name = name;
        this.setYear(year);
//        this.age = age;
        this.gender = gender;
        this.from = from;
        this.phone = phone;
        this.email = email;
        this.edu = edu;
        this.dept = dept;
        this.wage = wage;
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

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void setYear(String year) {
        this.year = LocalDate.parse(year, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.year, today);
        return period.getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public DepartmentEnum getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEnum department) {
        this.department = department;
    }
}
