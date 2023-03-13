package figures;

public class square extends polygones {

    public square(float[] sides) {
        super(sides);
    }

    @Override
    public float getPerimetr() {
        return (super.getSide(0) + super.getSide(0)) * 2;
    }

    @Override
    public float getArea() {
        return super.getSide(0) * super.getSide(0);
    }

    @Override
    public String toString() {
        return String.format("Квадрат, Сторона: %s, Площадь: %.2f Периметр: %.2f", super.toString(), this.getArea(), this.getPerimetr());
    }
    
    @Override
    public int compareTo(baseFig a) {
        return Float.compare(getArea(), a.getArea());
    }
}
