package JsonUno;

import java.util.List;

public class ContactDetails {

    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "contact=" + contact +
                '}';
    }
}
