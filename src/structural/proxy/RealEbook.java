package structural.proxy;

public class RealEbook implements Ebook {
    private final String filename;

    public RealEbook(String filename) {
        this.filename = filename;
        load();
    }

    @Override
    public void show() {
        System.out.println("Showing ebook " + filename);
    }

    private void load() {
        System.out.println("Loading ebook " + filename);
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
