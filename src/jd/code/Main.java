package jd.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int b = 0;
            System.out.print("   AREA DE FIGURAS \n 1. Rectangulo \n 2. Cuadrado \n 3. Circulo \n 4. Salir \n Que deseas hacer? :  ");
            String valorm = scanner.nextLine();
            int m = Integer.parseInt(valorm);
            switch (m) {
                case 1:
                    System.out.print("Ingrese Altura: ");
                    String valory = scanner.nextLine();
                    b = Integer.parseInt(valory);
                case 2:

                    System.out.print("Ingrese Base: ");
                    break;
                case 3:
                    System.out.print("Ingrese Radio: ");
                    break;
                case 4:
                    System.exit(0);
                default: //En caso de opcion superior a 4
                    System.out.println("Opcion Invalida");
                    break;
            }
            if (m < 4) { //En caso de opcion invalida evita instrucciones
                String valorx = scanner.nextLine();
                int a = Integer.parseInt(valorx);
                Area ar;
                Figura rec;
                Figura cua;
                Figura cir;
                rec = new Rectangulo(a, b);
                cua = new Cuadrado(a);
                cir = new Circulo(a);
                if (m == 1)
                    ar = new Area(rec);
                else if (m == 2)
                    ar = new Area(cua);
                else
                    ar = new Area(cir);
                ar.area();
            }
            System.out.println(" --------------------- \n");
        } while (true);
    }
}