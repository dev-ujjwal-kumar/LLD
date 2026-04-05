package SOLID Principles.LSP.Good Code;

public class ReadableFile implements Readable {
    @Override
    public void read() {
        System.out.println("Reading file...");
    }
    
}
