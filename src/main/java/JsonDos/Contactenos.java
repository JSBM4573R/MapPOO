package JsonDos;

public class Contactenos {

    private String number;
    private String typoContacto;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTypoContacto() {
        return typoContacto;
    }

    public void setTypoContacto(String typoContacto) {
        this.typoContacto = typoContacto;
    }

    @Override
    public String toString() {
        return "Contactenos{" +
                "number='" + number + '\'' +
                ", typoContacto='" + typoContacto + '\'' +
                '}';
    }
}
