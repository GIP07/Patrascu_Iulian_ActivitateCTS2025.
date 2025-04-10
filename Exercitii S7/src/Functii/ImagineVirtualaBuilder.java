package Functii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImagineVirtualaBuilder implements IImagineVirtuala{

    private final List<String> aplicatiiInstalate;


    public ImagineVirtualaBuilder(List<String> aplicatiiInstalate) {
        this.aplicatiiInstalate = Collections.unmodifiableList(aplicatiiInstalate);
    }
    public List<String> getAplicatiiInstalate() {
        return aplicatiiInstalate;
    }

    public void afiseazaDescriereImagineVirtuala() {
        System.out.printf("Imaginea virtuala contine aplicatiile:" + aplicatiiInstalate);
    }
    public void instaleazaAplicatie(String numeAplicatie) {
        throw new UnsupportedOperationException("Aplicatiile nu mai pot fi instalate dupa ce imaginea a fost creata");
    }

    public static class Builder{
        private List<String> aplicatii = new ArrayList<>();

        public Builder adaugaAplcatie(String numeAplicatie) {
            aplicatii.add(numeAplicatie);
            return this;
        }
        public ImagineVirtualaBuilder build() {
            return new ImagineVirtualaBuilder(aplicatii);
        }
    }
}
