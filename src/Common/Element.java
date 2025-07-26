package Common;

import java.util.List;

public interface Element {
    List<Element> getConstituentElements();
    String getDescription();
    int getNetto();
    void setNetto(int netto);
}
