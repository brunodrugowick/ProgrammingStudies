import java.io.Console;

public class ContactsManager {

    Contact [] myContacts;
    int numberOfContacts;

    public ContactsManager() {
        this.myContacts = new Contact[500];
        this.numberOfContacts = 0;

    }

    public void addContact(Contact newContact) {
        this.myContacts[numberOfContacts] = newContact;
        this.numberOfContacts++;

        System.out.println("Contact added: " + newContact.name + " | " + newContact.phoneNumber);
    }

    public Contact searchContact(String searchString) {
        // Search for empoty string? Don't do it.
        if (searchString.length() == 0) {
            System.out.println("Cannot search for an empty contact name.");
            return null;
        }
        // Actually search for the contact and return if found.
        for (int i=0;i<this.numberOfContacts;i++) {
            if (myContacts[i].name.equals(searchString)) {
                System.out.println("Found " + myContacts[i].name + ". Returning to caller function.");
                return myContacts[i];
            }
        }
        // Didn't find anything
        System.out.println("Didn't find anything.");
        return null;
    }

}
