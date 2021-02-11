import java.util.Scanner;

public class Ex1 {
    public static int Ex1_qnegativos(int n){
        Scanner teclado = new Scanner(System.in);
        int quant_negativ = 0;
        int num_atual;
        for (int i=0; i<n; i++){
            System.out.print(i+1+"º número: ");
            num_atual = teclado.nextInt();
            if (num_atual < 0){
                quant_negativ +=1;
            }
        }
        System.out.println("Quantidade de números negativos: "+quant_negativ+".");
        return quant_negativ;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        Ex1_qnegativos(teclado.nextInt());
    }
}
