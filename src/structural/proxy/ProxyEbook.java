package structural.proxy;

public class ProxyEbook implements Ebook {
    private final String filename;
    private RealEbook ebook;

    public ProxyEbook(String filename) {
        this.filename = filename;
    }

    @Override
    public void show() {
        if (ebook == null) {
            ebook = new RealEbook(filename);
        }
        ebook.show();
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
