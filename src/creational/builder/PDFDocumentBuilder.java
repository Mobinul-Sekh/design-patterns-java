package creational.builder;

public class PDFDocumentBuilder implements PresentationBuilder {
    private PDFDocument pdf = new PDFDocument();
    @Override
    public void addSlide(Slide slide) {
        pdf.addPage(slide.getText());
    }

    public PDFDocument getPdf() {
        return pdf;
    }
}
