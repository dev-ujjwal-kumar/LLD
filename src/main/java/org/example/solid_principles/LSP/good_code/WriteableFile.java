package org.example.solid_principles.lsp.good_code;

public class WriteableFile extends ReadableFile implements Writable {
    @Override
    public void write() {
        System.out.println("Writing to file...");
    }
}
