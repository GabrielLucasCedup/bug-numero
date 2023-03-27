import java.util.Scanner;

public class bugNumero {

    public static void main(String[] args) {

        String num = "";
        Scanner read = new Scanner(System.in);
        boolean ver = true;
        while (ver) {
            System.out.print("Digite um número: ");
            num = read.next();
            if (isInteger(num)) {
                ver = false;
            } else {
                System.out.println("Caractere inválido!");
            }
        }
        System.out.println("O número é: " + num);
        read.close();

    }

    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }

}
