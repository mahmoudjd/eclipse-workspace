package uebung7;

public class ListElement {
    private int value;
    public ListElement next ;

    public ListElement( int value){
        this.value= value;
        this.next= null;
    }
    public ListElement(int value, ListElement next){
        this.value= value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }
}
