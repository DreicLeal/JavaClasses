import java.util.Scanner;

public class mathLib  {
    public static void main(String[] args) {
       double x, y, z, A, B, C;

    x = 2;
    y = 25;
    z = 5;

    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(100);
    System.out.printf("A raíz quadrada de %.2f é igual a %.1f%n",x, A);
    System.out.printf("A raíz quadrada de %.2f é igual a %.1f%n",y, B);
    System.out.printf("A raíz quadrada de 100 é igual a %.1f%n", C);
    
    A = Math.pow(x, y);
    B = Math.pow(y, x);
    C = Math.pow(z, x);
    System.out.printf("A potência de %.1f elevado a %.1f é igual a %.1f%n", x, y, A);
    System.out.printf("A potência de %.1f elevado a %.1f é igual a %.1f%n", y, x, B);
    System.out.printf("A potência de %.1f elevado a %.1f é igual a %.1f%n", z, x, C);
    }
}