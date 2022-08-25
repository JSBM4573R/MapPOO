package JsonUno;

public class Number {

    private int idNumber;
    private String descriptionNumber;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDescriptionNumber() {
        return descriptionNumber;
    }

    public void setDescriptionNumber(String descriptionNumber) {
        this.descriptionNumber = descriptionNumber;
    }

    @Override
    public String toString() {
        return "Number{" +
                "idNumber=" + idNumber +
                ", descriptionNumber='" + descriptionNumber + '\'' +
                '}';
    }
}
