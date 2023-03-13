import java.util.Comparator;

import figures.baseFig;

public class CompArea implements Comparator<baseFig> {

    @Override
    public int compare(baseFig a, baseFig b) {
        return Float.compare(a.getArea(), b.getArea());
    }
}
