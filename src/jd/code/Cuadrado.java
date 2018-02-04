package jd.code;

public class Cuadrado extends Figura {

    public Cuadrado(int x)

    {
        super(x);
    }

    public void area()

    {
        int a = x * x;
        System.out.println(a);
    }
}