package org.example.solid_principles.lsp.good_code;

// Here we have created two interfaces Readable and Writable 
// and two classes ReadableFile and WriteableFile which implements these interfaces.

public class Main {
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadableFile();
        readableFile.read(); // works fine

        WriteableFile writeableFile = new WriteableFile();
        writeableFile.read(); // works fine
        writeableFile.write(); // works fine
    }
}
