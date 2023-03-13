package figures;

public class triangle extends polygones {

    public triangle(float[] sd) {
        super(sd);
    }

    @Override
    public float getPerimetr() {
        return super.getPerimetr();
    }

    @Override
    public float getSide(int n) {
        return super.getSide(n);
    }

    @Override
    public float[] getSides() {
        return super.getSides();
    }

    @Override
    public float getArea() {
        float p = (float) (getPerimetr() / 2.0);
        return (float) Math.sqrt(p * (p - super.getSide(0)) * (p - super.getSide(1)) * (p - super.getSide(2)));
    }

    @Override
    public String toString() {
        return String.format("Треугольник, Стороны: %s, Площадь: %.2f Периметр: %.2f", super.toString(), this.getArea(), this.getPerimetr());
    }

    @Override
    public int compareTo(baseFig a) {
        return Float.compare(getArea(), a.getArea());
    }
}