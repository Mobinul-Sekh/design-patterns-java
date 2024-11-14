package structural.adapter;

import structural.adapter._3rdPartyFilterLibrary.Caramel;

public class _3rdPartyCaramelAdapterInheritance extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
