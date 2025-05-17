public class PrintGeneric<T> {

    private T thisGeneric;

    public PrintGeneric(T thingToPrint) {
        this.thisGeneric = thingToPrint;
    }

    public void printGeneric() {
        System.out.println(thisGeneric);
    }
}
