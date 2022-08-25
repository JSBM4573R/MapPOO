package JsonDos;

import java.util.List;

public class DatosContacto {

    private String datoDeContacto;
    private List<Contactenos> listContactenos;

    public String getDatoDeContacto() {
        return datoDeContacto;
    }

    public void setDatoDeContacto(String datoDeContacto) {
        this.datoDeContacto = datoDeContacto;
    }

    public List<Contactenos> getListContactenos() {
        return listContactenos;
    }

    public void setListContactenos(List<Contactenos> listContactenos) {
        this.listContactenos = listContactenos;
    }

    @Override
    public String toString() {
        return "datosContacto{" +
                "datoDeContacto='" + datoDeContacto + '\'' +
                ", listContactenos=" + listContactenos +
                '}';
    }
}
