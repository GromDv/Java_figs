import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import figures.baseFig;

public class colFigs implements Iterable<baseFig>, Comparator<baseFig> {

    public List<baseFig> figCollection;

    public colFigs() {
        this.figCollection = new ArrayList<>(0);
    }

    public void add(baseFig o) {
        figCollection.add(o);
    }

    public void remove(int index) {
        figCollection.remove(index);
    }

    public void set(int index, baseFig o) {
        figCollection.set(index, o);
    }

    public void sortByArea1() {
        Collections.sort(figCollection);
    }

    public void sortByArea2() {
        Collections.sort(figCollection, new CompArea());
    }

    public void printList() {
        System.out.println();
        for (baseFig fig : figCollection) {
            System.out.println(fig.toString());
        }
    }

    @Override
    public Iterator<baseFig> iterator() {
        Iterator<baseFig> it = new Iterator<baseFig>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < figCollection.size();
            }

            @Override
            public baseFig next() {
                return figCollection.get(index++);
            }
        };
        return it;
    }

    @Override
    public int compare(baseFig a, baseFig b) {
        float s1 = a.getArea();
        float s2 = b.getArea();
        
        return Float.compare(s1, s2);
    }

}
