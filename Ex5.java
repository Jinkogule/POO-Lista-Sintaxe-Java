import java.util.Scanner;

public class Ex5 {
    public static int Ex5_fatorial(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Fatorial a ser calculado: ");
        int N = teclado.nextInt();

        if (N>0){
            int inicial_N = N;
            int aux_fat_N = N;
            while (aux_fat_N > 1){
                N = N * (aux_fat_N - 1);
                aux_fat_N--;
            }
            System.out.println("O fatorial de "+inicial_N+" é "+N+".");
            return N;
        }
        else{
            System.out.println("Não é possível calcular o fatorial de "+N+".");
            return -1;
        }

    }
    public static void main(String[] args) {
        Ex5_fatorial();
    }
}
