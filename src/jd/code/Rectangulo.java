package jd.code;

public class Rectangulo extends Figura {

    private int y;

    public Rectangulo(int x, int y)

    {
        super(x);
        this.y = y;
    }

    public void area()

    {
        int a = x * y;
        System.out.println(a);
    }
}