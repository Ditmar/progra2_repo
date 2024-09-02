import java.util.Scanner;

import grades.ManagementGrades;

public class App {
    public static void main(String[] args) throws Exception {
        ManagementGrades managementGrades = new ManagementGrades();
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        String readKeyBoard;
        do {
            
            createMenu();
            readKeyBoard = input.nextLine();
            if (readKeyBoard.equals("1")) {
                String grade = input.nextLine();
                managementGrades.addGrade(Integer.parseInt(grade));
            } else if (readKeyBoard.equals("2")) {
                managementGrades.showGrades();
            } else if (readKeyBoard.equals("3")) {
                managementGrades.showApproved();
            }
        }
        while (!readKeyBoard.equals("4"));
        input.close();
    }
    public static void createMenu()  {
        System.out.println("1. Agregar Nota");
        System.out.println("2. ver nota");
        System.out.println("3. Ver aprobados");
        System.out.println("4. Salir");
    }
}
