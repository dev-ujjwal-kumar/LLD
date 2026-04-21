package org.example.solid_principles.lsp.good_code;

public class ReadableFile implements Readable {
    @Override
    public void read() {
        System.out.println("Reading file...");
    }
    
}
