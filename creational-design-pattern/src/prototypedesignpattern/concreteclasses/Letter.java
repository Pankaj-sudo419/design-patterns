package prototypedesignpattern.concreteclasses;

import prototypedesignpattern.prototypeinterface.Document;


public class Letter implements Document {

    private  String letterContent;

    public Letter(){
       this.letterContent = "This Is default Content";
    }

    public Letter(String letterContent){
        this.letterContent = letterContent;
    }
    @Override
    public Document clone() {
        return new Letter(this.letterContent);
    }

    @Override
    public void print() {
        System.out.println("Letter: " + letterContent);
    }
}
