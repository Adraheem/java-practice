package contacts;

import contacts.exceptions.ContactNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Contact> contacts;
    private static int idCounter = 0;

    public PhoneBook() {
        contacts = new ArrayList<>();
        PhoneBook.idCounter = 0;
    }

    public void add(Contact contact) {
        contact.setId(++idCounter);
        this.contacts.add(contact);
    }

    public List<Contact> getAllContact() {
        return contacts;
    }

    public Contact getContactById(int id) {
        Contact contactToReturn = null;

        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                contactToReturn = contact;
                break;
            }
        }

        if (contactToReturn == null) throw new ContactNotFoundException();
        return contactToReturn;
    }

    public void updateContactName(int id, String name) {
        Contact contact = this.getContactById(id);
        contact.setName(name);
    }

    public void updateContactEmail(int id, String email) {
        Contact contact = this.getContactById(id);
        contact.setEmail(email);
    }

    public void updateContactTelephone(int id, String telephone) {
        Contact contact = this.getContactById(id);
        contact.setTelephone(telephone);
    }

    public void updateContactAddress(int id, Address newAddress) {
        Contact contact = this.getContactById(id);
        contact.setAddress(newAddress);
    }

    public void delete(int id) {
        Contact contact = this.getContactById(id);

        int index = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).equals(contact)) {
                index = i;
                break;
            }
        }
        contacts.remove(index);
    }
}
