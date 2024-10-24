package prototypedesignpattern.prototypeinterface;

public interface Document extends Cloneable {
    Document clone();
    void print();
}
