package JsonUno;

public class DocumentType {


    private DocumentType documentType;
    private String id;
    private Number number;

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "documentType=" + documentType +
                ", id='" + id + '\'' +
                ", number=" + number +
                '}';
    }
}
