package SOLID Principles.LSP.Bad Code;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read(); // works fine
        file.write(); // throwing exception because ReadOnlyFile cannot write, but it is a subtype of File, so it violates LSP.
    }
}
