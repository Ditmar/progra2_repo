package contact;

import java.util.HashMap;

public class ContactManager {
    private HashMap<String, Contact> contacts;
    public ContactManager() {
        this.contacts = new HashMap<>();
    }
    public void addContact(Contact contact) {
        this.contacts.put(contact.getEmail(), contact);
    }
    public Contact searchContact(String email) {
        if (this.contacts.containsKey(email)) {
            return this.contacts.get(email);
        }
        return null;
    }
    public Boolean removeContact(String email) {
        if (this.contacts.containsKey(email)) {
            this.contacts.remove(email);
            return true;
        }
        return false;
    }
    public void showAllContacts() {
        for (Contact contact : this.contacts.values()) {
            contact.print();
        }
    }
}