package figures;

import java.util.Arrays;

import ifaces.perimetrable;
import ifaces.squareable;

public class polygones extends baseFig implements perimetrable, squareable {
    private float[] sides;

    public polygones(float[] sides) {
        this.sides = sides;
    }

    public float[] getSides() {
        return sides;
    }

    public void setSides(float[] sides) {
        this.sides = sides;
    }

    public float getSide(int n) {
        return this.sides[n];
    }

    public String toString() {
        return String.format("%s", Arrays.toString(sides));
    }

    @Override
    public float getPerimetr() {
        float perimetr = 0;
        for (float side : sides) {
            perimetr += side;
        }
        return perimetr;
    }
}
