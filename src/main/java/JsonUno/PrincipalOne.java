package JsonUno;

public class PrincipalOne {

    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
    private String suffix;
    private ContactDetails contactDetails;
    private IdentityDocuments identityDocuments;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public IdentityDocuments getIdentityDocuments() {
        return identityDocuments;
    }

    public void setIdentityDocuments(IdentityDocuments identityDocuments) {
        this.identityDocuments = identityDocuments;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", suffix='" + suffix + '\'' +
                ", contactDetails=" + contactDetails +
                ", identityDocuments=" + identityDocuments +
                '}';
    }
}
