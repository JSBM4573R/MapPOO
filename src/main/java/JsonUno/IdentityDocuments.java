package JsonUno;

public class IdentityDocuments {

    private DocumentType documentType;
    private int documenNumber;

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public int getDocumenNumber() {
        return documenNumber;
    }

    public void setDocumenNumber(int documenNumber) {
        this.documenNumber = documenNumber;
    }

    @Override
    public String toString() {
        return "IdentityDocuments{" +
                "documentType=" + documentType +
                ", documenNumber=" + documenNumber +
                '}';
    }
}
