import java.util.Scanner;

public class Ex8 {
    public static void Ex8_criamatriz_e_verifqmagico(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ordem da matriz quadrada: ");
        int n = teclado.nextInt();

        int []soma_i = new int[n];
        int []soma_j = new int[n];
        int soma_diag1 = 0;
        int soma_diag2 = 0;

        int[][] matriz = new int[n][n];
        System.out.println("\nMatriz "+n+" por "+n+":\n");

        for (int i=0 ; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("Valor do elemento ["+(i+1)+"]["+(j+1)+"]: ");
                int valor = teclado.nextInt();
                soma_i[i]+=valor;
                soma_j[j]+=valor;
                if (i==j){
                    soma_diag1+=valor;
                }
                if (j==n-i-1){
                    soma_diag2+=valor;
                }
            }
        }
        boolean q_magico = (soma_diag1==soma_diag2) && (soma_i[0]==soma_diag1) && (soma_j[0]==soma_diag1);
        for (int i=1; i<n && q_magico; i++){
            q_magico = (soma_i[i]==soma_j[i]) && (soma_i[i-1]==soma_i[i]);
        }
        if (q_magico){
            System.out.println("Essa matriz é um quadrado mágico.");
        }
        else{
            System.out.println("Essa matriz não é um quadrado mágico.");
        }
    }

    public static void main(String[] args) {
        Ex8_criamatriz_e_verifqmagico();
    }
}


