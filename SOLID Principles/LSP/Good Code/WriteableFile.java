package SOLID Principles.LSP.Good Code;

public class WriteableFile extends ReadableFile implements Writable {
    @Override
    public void write() {
        System.out.println("Writing to file...");
    }
}
