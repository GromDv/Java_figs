package figures;

public class rectangle extends polygones {

    public rectangle(float[] sides) {
        super(sides);
        if (sides[0] == sides[1])
            System.out.println("С таким набором сторон - это квадрат!");
    }

    @Override
    public float getPerimetr() {
        return (super.getSide(0) + super.getSide(1)) * 2;
    }

    @Override
    public float getArea() {
        return super.getSide(0) * super.getSide(1);
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник, Стороны: %s, Площадь: %.2f Периметр: %.2f", super.toString(),
                this.getArea(), this.getPerimetr());
    }

    @Override
    public int compareTo(baseFig a) {
        return Float.compare(getArea(), a.getArea());
    }
}
