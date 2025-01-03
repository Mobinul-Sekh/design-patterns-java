package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFilename(), ebook);
    }

    public void openEbook(String filename) {
        ebooks.get(filename).show();
    }
}
