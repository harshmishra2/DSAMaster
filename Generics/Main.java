public class Main {

    public static void main(String args[]) {

        PrintInteger printInteger = new PrintInteger(30);
        printInteger.printFunction();

        String newString = "This is a string";
        PrintString printString = new PrintString(newString);
        printString.printFunction();

        // See for the above two pieces of code we've got to replicate the entire code
        // for two classes which are doing almost similar code, here comes generics into
        // play handling this conveniently.

        PrintGeneric<Integer> printGeneric = new PrintGeneric<>(45);
        printGeneric.printGeneric();

        String anotherNewString = "Another string printed using generic";
        PrintGeneric<String> printAnotherGeneric = new PrintGeneric<>(anotherNewString);
        printAnotherGeneric.printGeneric();
    }

}