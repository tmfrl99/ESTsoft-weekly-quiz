package quiz02;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                if (contact instanceof BusinessContact businessContact) {
                    businessContact.display();
                } else if (contact instanceof PersonalContact personalContact) {
                    personalContact.display();
                }
            }
        }
    }

    void searchContact(String name) {
        int cnt = 0;
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                if (contact.getName().equals(name)) {
                    cnt++;
                    if (contact instanceof BusinessContact businessContact) {
                        businessContact.display();
                    } else if (contact instanceof PersonalContact personalContact) {
                        personalContact.display();
                    }
                }
            }

            if (cnt == 0) {
                System.out.println("연락처를 찾을 수 없습니다.");
            }
        }
    }
}
