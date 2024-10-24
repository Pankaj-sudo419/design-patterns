package prototypedesignpattern.concreteclasses;

import prototypedesignpattern.prototypeinterface.Document;


public class Invoice implements Document {

    private String invoiceDetails;

    public Invoice(){
        this.invoiceDetails = "Default Invoice details";
    }

    public Invoice(String invoiceDetails){
        this.invoiceDetails = invoiceDetails;
    }
    @Override
    public Document clone() {
        return new Invoice(this.invoiceDetails);
    }

    @Override
    public void print() {
        System.out.println("This is Invoice Details: " + invoiceDetails);
    }
}
