import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
// testando tipos de variáveis
        int idade = 30;
        double num = 30.14978;
        String nome = "Dreic";
        double height = 1.74;
        char genre = 'M';
        System.out.println("A minha idade é: "+ idade +", Meu nome é: " + nome + ", meu gênero é: " + genre);
        System.out.printf("A minha idade é:  %d, Meu nome é:  %s, a minha altura é: %.2f%n", idade, nome, height);
        System.out.printf("%.2f%n", num);
        System.out.println("Hello World! ");

// pequenos cálculos
        float area, b, B, H;

        b = 6f;
        B = 8f;
        H = 5f;
        area = ((b+B)/2)*H;

        System.out.printf("A área deste trapézio é igual a: %.1f%n", area);
        // divisão com resultado double
        int y, z;
        double result;
    
        y = 5;
        z = 2;
        result = (double) y / z;
        System.out.printf("O resultado dessa equação é igual a: %.1f", result);

        Scanner read = new Scanner(System.in);

        String alias = read.next();
        int numbers = read.nextInt();
        double floater = read.nextDouble();
       
        System.out.printf(" Você digitou: %d%n, %s e %.2f", numbers, alias, floater);

        read.close();
    }
}