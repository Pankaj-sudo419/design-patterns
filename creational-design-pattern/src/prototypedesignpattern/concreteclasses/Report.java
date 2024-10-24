package prototypedesignpattern.concreteclasses;

import prototypedesignpattern.prototypeinterface.Document;

public class Report implements Document {
    private  String reportContent;

    public Report(){
        this.reportContent = "This is default report";
    }

    public Report(String reportContent){
        this.reportContent = reportContent;
    }
    @Override
    public Document clone() {
        return new Report(this.reportContent);
    }

    @Override
    public void print() {
        System.out.println("This is report content: " + reportContent);
    }
}
