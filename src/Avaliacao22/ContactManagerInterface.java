package Avaliacao22;


public interface ContactManagerInterface {
    void load(String filePath);

    void save(String filePath);

    boolean validateEmail(String email);

    boolean validatePhoneNumber(String phoneNumber);

    boolean addContact(Contact person);

    boolean removeContact(Contact person);

    Contact searchContactByname(String name);

    Contact searchContactByEmail(String email);

    Contact searchContactByPhoneNumber(int phoneNumber);

    void listAllContacts();

    void listContactsByName();

    void listContactsByPhoneNumber();

    void listContactsByBirthDate();
}
