package student;

public class UniversityStudent {
    private String name;
    private String lastName;
    private String ci;
    private Integer age;
    private String address;
    private String email;
    public UniversityStudent(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void println() {
        System.out.println("Name: " + this.name + "  " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
}
