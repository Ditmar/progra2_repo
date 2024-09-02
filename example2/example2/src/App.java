import student.UniversityStudent;

public class App {
    public static void main(String[] args) throws Exception {
        UniversityStudent student = new UniversityStudent("Maria", "Gomez");
        student.setAge(23);
        student.setAddress("plan 40");
        student.setCi("123453");
        student.setEmail("maria@gmail.com");
        student.println();
        
    }
}
