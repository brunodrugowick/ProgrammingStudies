public class Main {
    public static void main (String [] args) {

        // Initializing ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Creating contact 1
        Contact lara = new Contact("Lara", "5519911111111");
        myContactsManager.addContact(lara);

        // Creating more contacts
        Contact contact1 = new Contact("Bruno", "5519922222222");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact("Contact 2", "55199123456789");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact("Contact 3", "55199987654321");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact("Contact 4", "55199000000000");
        myContactsManager.addContact(contact4);

        String searchString = "Bruno";
        Contact result = myContactsManager.searchContact(searchString);
        System.out.println("Got the following contact when searching for " + searchString + ": " + result);
    }
}
