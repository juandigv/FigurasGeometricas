package jd.code;

public class Area {

    Figura figu;

    public Area(Figura figu) {
        this.figu = figu;
    }

    public void area() {
        System.out.print("El Area es: ");
        this.figu.area();
    }
}
