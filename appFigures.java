import figures.baseFig;
import figures.circle;
import figures.rectangle;
import figures.square;
import figures.triangle;

public class appFigures {
    public static void main(String[] args) {
        colFigs myCollection = new colFigs();

        myCollection.add(new triangle(new float[] {18,16,9}));
        myCollection.add(new rectangle(new float[] {7,5}));
        myCollection.add(new square(new float[] {5}));
        myCollection.add(new circle(9));

        for (baseFig fig : myCollection) {
            System.out.println(fig.toString());
        }

        myCollection.sortByArea1();
        myCollection.printList();

        myCollection.set(2, new  triangle(new float[] {5,11,7}));
        myCollection.sortByArea2();
        myCollection.printList();
    }
}
