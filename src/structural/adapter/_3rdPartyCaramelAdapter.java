package structural.adapter;

import structural.adapter._3rdPartyFilterLibrary.Caramel;

public class _3rdPartyCaramelAdapter implements Filter {
    private Caramel caramel;

    public _3rdPartyCaramelAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
