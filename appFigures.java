import figures.baseFig;
import figures.circles;
import figures.rectangles;
import figures.squares;
import figures.triangles;

public class appFigures {
    public static void main(String[] args) {
        colFigs myCollection = new colFigs();

        float[] sidesTri = {18,16,9};
        myCollection.add(new triangles(sidesTri));
        float[] sidesRect = {7,5};
        myCollection.add(new rectangles(sidesRect));
        float[] sidesSqu = {5};
        myCollection.add(new squares(sidesSqu));
        myCollection.add(new circles(9));

        for (baseFig fig : myCollection) {
            System.out.println(fig.toString());
        }

        myCollection.sortByArea1();
        myCollection.printList();

        float[] sidesTri1 = {5,11,7};
        myCollection.set(2, new  triangles(sidesTri1));
        myCollection.sortByArea2();
        myCollection.printList();
    }
}
