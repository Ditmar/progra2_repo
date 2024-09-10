import java.util.Scanner;

import contact.Contact;
import contact.ContactManager;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String readKeyBoard;
        ContactManager contactManager = new ContactManager();

        do {
            
            createMenu();
            readKeyBoard = input.nextLine();
            Integer options = Integer.parseInt(readKeyBoard);
            switch (options) {
                case 1: {
                    System.out.println("Please add a new contact");
                    System.out.println("Write the name");
                    String name = input.nextLine();
                    System.out.println("Write the email");
                    String email = input.nextLine();
                    System.out.println("Write the age");
                    String age = input.nextLine();
                    Contact contact = new Contact(name, Integer.parseInt(age), email);
                    contactManager.addContact(contact);
                    break;
                }
                case 2: {
                    System.out.println("To search a contact you need to put the email:");
                    String email = input.nextLine();
                    Contact result = contactManager.searchContact(email);
                    result.print();
                    break;
                }
                case 3: {
                    System.out.println("To remove a contact you need to put the email:");
                    String email = input.nextLine();
                    contactManager.removeContact(email);
                    break;
                }
                case 4: {
                    contactManager.showAllContacts();
                    break;
                }
            }
        }
        while (!readKeyBoard.equals("5"));
        input.close();
    }
    public static void createMenu()  {
        System.out.println("1. Add Contact");
        System.out.println("2. Search Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Show Contact");
        System.out.println("5. Quit");
    }
}
