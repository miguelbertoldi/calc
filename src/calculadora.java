import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double x=0, y=0;

        for(int opcao=5; opcao!=0; opcao=opcao){
            System.out.println("Escolha: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair\n");
            opcao = ler.nextInt();

            if(opcao!=0){
                System.out.println("Digite o primeiro número: ");
                x = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                y = ler.nextInt();
                switch(opcao){
                    case 1:
                        soma(x, y);
                        break;
                    case 2:
                        subtracao(x,y);
                        break;
                    case 3:
                        multiplicacao(x,y);
                        break;
                    case 4:
                        divisao(x,y);
                        break;
                }
            }
        }

    }
    static void soma(double x, double y){
        System.out.println(x+y +"\n");
    }
    static void subtracao(double x, double y){
        System.out.println(x-y +"\n");
    }
    static void multiplicacao(double x, double y){
        System.out.println(x*y +"\n");
    }
    static void divisao(double x, double y){
        System.out.println(x/y +"\n");
    }
}
