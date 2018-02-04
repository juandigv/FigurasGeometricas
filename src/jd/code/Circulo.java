package jd.code;

public class Circulo extends Figura {

    public Circulo(int x)

    {
        super(x);
    }

    public void area()

    {
        double a = Math.PI * x * x;
        System.out.println(a);
    }
}
