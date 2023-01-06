import java.util.Scanner;

public class outputingData  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        String name, surName, lastName, alias;

        idade = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        surName = sc.nextLine();
        lastName = sc.nextLine();
        alias = sc.nextLine();

        System.out.println("Os dados digitados foram: ");
        System.out.println(idade);
        System.out.println(name);
        System.out.println(surName);
        System.out.println(lastName);
        System.out.println(alias);

        sc.close();
    }
}