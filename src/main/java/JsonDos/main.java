package JsonDos;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        PrincipalTwo principalTwoJsonResponse = generateDataTwo();

        System.out.println(principalTwoJsonResponse.toString());
    }

    public static PrincipalTwo generateDataTwo() {

        List<Contactenos> listContactenos = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Contactenos contactenos = new Contactenos();
            contactenos.setNumber("0" + i);
            contactenos.setTypoContacto("MOBILE " + i);
            listContactenos.add(contactenos);
        }

        DatosContacto datosContacto = new DatosContacto();
        datosContacto.setDatoDeContacto("3163782893");
        datosContacto.setListContactenos(listContactenos);

        PrincipalTwo principalTwo = new PrincipalTwo();
        principalTwo.setNombreCompleto("Juan Sebastian Bustos Marroquin");
        principalTwo.setSufijo("JR");
        principalTwo.setDatosContacto(datosContacto);

        return principalTwo;
    }

}
