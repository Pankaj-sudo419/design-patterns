package prototypedesignpattern;

import prototypedesignpattern.concreteclasses.Report;
import prototypedesignpattern.manager.DocumentManager;
import prototypedesignpattern.prototypeinterface.Document;

public class Client {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();

        Document letter1 = documentManager.createDocument("Letter");
        letter1.print();

        Document report1 = documentManager.createDocument("Report");
        report1.print();

        Document invoice1 = documentManager.createDocument("Invoice");
        invoice1.print();

        Document customReport = new Report("This Is Custom Report");
        documentManager.addPrototypes("customReport",customReport);

        Document report2 = documentManager.createDocument("customReport");
        report2.print();
        

    }
}
