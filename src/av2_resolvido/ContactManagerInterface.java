package av2_resolvido;

public interface ContactManagerInterface {
    void load(String filePath);

    void save(String filePath);

    boolean validateEmail(String email);

    boolean validatePhoneNumber(String phoneNumber);

    boolean addContact(Contact person);

    boolean removeContact(Contact person);

    Contact searchContactByName(String name);

    Contact searchContactByEmail(String email);

    Contact searchContactByPhoneNumber(int phoneNumber);

    void listAllContacts();

    void listContactsByName();

    void listContactsByPhoneNumber();

    void listContactsByBirthDate();

    void listContactsByEmail();
}
