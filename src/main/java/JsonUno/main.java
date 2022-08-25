package JsonUno;

import JsonDos.Contactenos;
import JsonDos.DatosContacto;
import JsonDos.Documento;
import JsonDos.PrincipalTwo;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        PrincipalOne principalOneJsonResponse = generateData();
        //System.out.println(principalOneJsonResponse.toString());

        PrincipalTwo principalOneJsonDos = mapeo(principalOneJsonResponse);

        System.out.println(principalOneJsonDos.toString());

    }

    public static PrincipalOne generateData() {

        /*List<Contact> listContact = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Contact contact = new Contact();
            contact.setNumber("0" + i);
            contact.setContactDetailType("MOBILE NUMERO " + i);
            listContact.add(contact);
        }
        */

        Contact contact = new Contact();
        contact.setNumber("123");
        contact.setContactDetailType("MOBILE");

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setContact(contact);

        Number number = new Number();
        number.setIdNumber(123);
        number.setDescriptionNumber("description");

        DocumentType documentType = new DocumentType();
        documentType.setId("NIF");
        documentType.setNumber(number);

        IdentityDocuments identityDocuments = new IdentityDocuments();
        identityDocuments.setDocumentType(documentType);
        identityDocuments.setDocumenNumber(123);

        PrincipalOne principalOne = new PrincipalOne();
        principalOne.setFirstName("Juan");
        principalOne.setMiddleName("Sebastian");
        principalOne.setLastName("Bustos");
        principalOne.setSecondLastName("Marroquin");
        principalOne.setSuffix("JR");
        principalOne.setIdentityDocuments(identityDocuments);
        principalOne.setContactDetails(contactDetails);

        return principalOne;
    }

    // crear un metodo que va a recibir de entrada el objeto uno y tiene que retornar un objeto 2.
    public static PrincipalTwo mapeo(PrincipalOne principalOne) {

        PrincipalTwo principalTwo = new PrincipalTwo();

        principalTwo.setNombreCompleto(principalOne.getFirstName()+" "+principalOne.getMiddleName()+" "+principalOne.getLastName()+" "+principalOne.getSecondLastName());
        principalTwo.setSufijo(principalOne.getSuffix());

        List<Contactenos> listContactenos = new ArrayList<>();
        Contactenos contactenos = new Contactenos();
        contactenos.setTypoContacto(principalOne.getContactDetails().getContact().getContactDetailType());
        contactenos.setNumber(principalOne.getContactDetails().getContact().getNumber());
        listContactenos.add(contactenos);

        DatosContacto datosContacto = new DatosContacto();
        datosContacto.setDatoDeContacto(principalOne.getSuffix());
        datosContacto.setListContactenos(listContactenos);


        principalTwo.setDatosContacto(datosContacto);

        Documento documento = new Documento();
        documento.setNumero(principalOne.getIdentityDocuments().getDocumenNumber());
        documento.setTipo(principalOne.getIdentityDocuments().getDocumentType().getId());
        documento.setDescripcion(principalOne.getIdentityDocuments().getDocumentType().getNumber().getDescriptionNumber());

        principalTwo.setDocumento(documento);

        return principalTwo;
    }
}
