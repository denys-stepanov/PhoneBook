package ua.hillel.services;

import ua.hillel.Contacts.Contact;

import java.util.ArrayList;
import java.util.List;

public class inMemoryContactService implements ContactService {
    List<Contact> contacts = new ArrayList<>();
    @Override
    public List<Contact> getAll() {
        return contacts;
    }

    @Override
    public void removeContact(int index) {
        contacts.remove(index);
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List searchContact(String search){
        List<Contact> searches = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().startsWith(search)) {
                searches.add(contact);
            }
        }
        return searches;
    }
}