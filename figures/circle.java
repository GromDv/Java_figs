package figures;

import ifaces.rounds;

public class circle extends baseFig implements rounds {
    private float radius;

    public circle(float r) {
        this.radius = r;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius / 4);
    }

    @Override
    public float getLegthRound() {
        return (float) (2*Math.PI*radius);
    }
    @Override
    public String toString() {
        return String.format("Круг, Радиус: %.2f, Площадь: %.2f Дл.окружности: %.2f", radius, this.getArea(), this.getLegthRound());
    }

    @Override
    public int compareTo(baseFig a) {
        return Float.compare(getArea(), a.getArea());
    }
}
