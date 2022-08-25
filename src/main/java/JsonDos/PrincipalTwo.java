package JsonDos;

public class PrincipalTwo {

    private String nombreCompleto;
    private String sufijo;
    private DatosContacto datosContacto;
    private Documento documento;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getSufijo() {
        return sufijo;
    }

    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
    }

    public DatosContacto getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(DatosContacto datosContacto) {
        this.datosContacto = datosContacto;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", sufijo='" + sufijo + '\'' +
                ", datosContacto=" + datosContacto +
                ", documento=" + documento +
                '}';
    }
}
