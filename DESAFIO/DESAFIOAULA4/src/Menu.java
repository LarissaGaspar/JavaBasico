import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();

        System.out.println("Escolha um número de 1 a 3!");

        switch (num) {
            case 1:
                op.selecionaOpcao1();
            break;
            case 2:
                op.selecionaOpcao2();
            break;
            case 3:
                op.selecionaOpcao3();
            break;
            default:
            System.out.println("Opção inválida.");
            break;
    }
    }

}