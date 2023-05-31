package av2_resolvido;

import java.util.HashSet;
import java.util.Set;

public class ContactManager implements ContactManagerInterface {

    Set<Contact> contacts;

    public ContactManager() {
        contacts = new HashSet<>();
    }

    @Override
    public void load(String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'load'");
    }

    @Override
    public void save(String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean validateEmail(String email) {
        // this needs to be implemented

        return true;
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        // this needs to be implemented

        return true;
    }

    @Override
    public boolean addContact(Contact contact) {
        // returns false if already in contacts (equals)
        return contacts.add(contact);
    }

    @Override
    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }

    @Override
    public Contact searchContactByName(String name) {
        // could instead use a map name->contact (Map<String, Contact>)
        // this could be instead of the Set or in addition to

        // using Stream API over the set of contacts, we return the first match or null
        return contacts.stream()
            .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst().orElse(null);
        
    }

    @Override
    public Contact searchContactByEmail(String email) {
        // this can be done very easily by adapting search by name

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchContactByEmail'");
    }

    @Override
    public Contact searchContactByPhoneNumber(int phoneNumber) {
        // this can be done very easily by adapting search by name

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchContactByPhoneNumber'");
    }

    @Override
    public void listAllContacts() {
        // using Stream API
        contacts.stream().forEach(System.out::println);
    }

    @Override
    public void listContactsByName() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByName'");
    }

    @Override
    public void listContactsByPhoneNumber() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByPhoneNumber'");
    }

    @Override
    public void listContactsByBirthDate() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByBirthDate'");
    }

    @Override
    public void listContactsByEmail() {
        // create a sorted set, using a Comparator
        // then simply list the set, as above

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContactsByEmail'");
    }

}
