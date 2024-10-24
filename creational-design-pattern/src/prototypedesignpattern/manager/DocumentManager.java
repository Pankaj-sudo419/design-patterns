package prototypedesignpattern.manager;

import prototypedesignpattern.concreteclasses.Invoice;
import prototypedesignpattern.concreteclasses.Letter;
import prototypedesignpattern.concreteclasses.Report;
import prototypedesignpattern.prototypeinterface.Document;

import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, Document> documentPrototypeMap = new HashMap<>();

    public DocumentManager(){
        documentPrototypeMap.put("Letter", new Letter());
        documentPrototypeMap.put("Report", new Report());
        documentPrototypeMap.put("Invoice", new Invoice());
    }

    public Document createDocument(String type){
        Document document = documentPrototypeMap.get(type);
        return document != null ? document.clone():null;
    }

    public void addPrototypes(String type ,Document prototype){
        documentPrototypeMap.put(type,prototype);
    }
}
