package contacts;

import contacts.exceptions.ContactNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    private PhoneBook phoneBook;
    private Contact shola;
    private Contact raheema;

    @BeforeEach
    void setUp(){
        phoneBook = new PhoneBook();
        shola = new Contact("Shola", "shola@gmail.com", "09026734949", new Address("Ajanlekoko", "Lagos",
                "Nigeria"));
        raheema = new Contact("Raheema", "raheema@gmail.com", "081456736483", new Address("Sabo, Yaba", "Lagos",
                "Nigeria"));
    }

    @Test
    void phoneBookExistsTest(){
        assertNotNull(phoneBook);
    }

    @Test
    void canAddNewContactTest(){
        phoneBook.add(shola);
        assertEquals(shola, phoneBook.getAllContact().get(0));
        assertEquals(1, phoneBook.getAllContact().get(0).getId());
    }

    @Test
    void canAddTwoNewContactTest(){
        phoneBook.add(shola);
        phoneBook.add(raheema);

        assertEquals(shola, phoneBook.getAllContact().get(0));
        assertEquals(1, phoneBook.getAllContact().get(0).getId());

        assertEquals(raheema, phoneBook.getAllContact().get(1));
        assertEquals(2, phoneBook.getAllContact().get(1).getId());
    }

    @Test
    void canGetContactByIdTest(){
        phoneBook.add(shola);
        phoneBook.add(raheema);

        assertEquals(shola, phoneBook.getContactById(1));
        assertEquals(raheema, phoneBook.getContactById(2));
    }

    @Test
    void phoneBookThrowsExceptionWhileGettingContactByInvalidIdTest(){
        ContactNotFoundException exception = assertThrows(ContactNotFoundException.class,
                () -> phoneBook.getContactById(5));
        assertEquals("Contact not found", exception.getMessage());
    }

    @Test
    void canUpdateContactNameById(){
        phoneBook.add(shola);

        phoneBook.updateContactName(1, "Samuel");
        assertEquals("Samuel", phoneBook.getContactById(1).getName());
    }

    @Test
    void cannotUpdateContactNameByInvalidIdTest(){
        ContactNotFoundException exception = assertThrows(ContactNotFoundException.class,
                () -> phoneBook.updateContactName(1, "Samuel"));
        assertEquals("Contact not found", exception.getMessage());
    }

    @Test
    void canUpdateContactEmailById(){
        phoneBook.add(shola);

        phoneBook.updateContactEmail(1, "samuel@gmail.com");
        assertEquals("samuel@gmail.com", phoneBook.getContactById(1).getEmail());
    }

    @Test
    void cannotUpdateContactEmailByInvalidIdTest(){
        ContactNotFoundException exception = assertThrows(ContactNotFoundException.class,
                () -> phoneBook.updateContactEmail(1, "samuel@gmail.com"));
        assertEquals("Contact not found", exception.getMessage());
    }

    @Test
    void canUpdateContactPhoneNumberById(){
        phoneBook.add(raheema);

        phoneBook.updateContactTelephone(1, "09045454545");
        assertEquals("09045454545", phoneBook.getContactById(1).getTelephone());
    }

    @Test
    void cannotUpdateContactPhoneNumberByInvalidIdTest(){
        ContactNotFoundException exception = assertThrows(ContactNotFoundException.class,
                () -> phoneBook.updateContactTelephone(1, "09045454545"));
        assertEquals("Contact not found", exception.getMessage());
    }

    @Test
    void canUpdateContactAddressById(){
        phoneBook.add(raheema);

        Address newAddress = new Address("Iwo road, Ibadan", "Oyo", "Nigeria");
        phoneBook.updateContactAddress(1, newAddress);
        assertEquals(newAddress, phoneBook.getContactById(1).getAddress());
    }

    @Test
    void cannotUpdateContactAddressByInvalidIdTest(){
        ContactNotFoundException exception = assertThrows(ContactNotFoundException.class,
                () -> phoneBook.updateContactAddress(1, null));
        assertEquals("Contact not found", exception.getMessage());
    }

    @Test
    void canDeleteContactTest(){
        phoneBook.add(shola);
        phoneBook.add(raheema);

        assertEquals(2, phoneBook.getAllContact().size());

        int idToDelete = 2;
        phoneBook.delete(idToDelete);
        ContactNotFoundException exception = assertThrows(ContactNotFoundException.class,
                () -> phoneBook.getContactById(idToDelete));
        assertEquals("Contact not found", exception.getMessage());

        assertEquals(1, phoneBook.getAllContact().size());
    }
}
