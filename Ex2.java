import java.util.Scanner;

public class Ex2 {

    public static float Ex2_maiordostres(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite três números reais: ");

        float R = teclado.nextFloat();
        float T = teclado.nextFloat();
        float S = teclado.nextFloat();

        float maior_numero;

        if ((R > T) && (R > S)){
            maior_numero = R;
        }
        else if ((T > R) && (T > S)){
            maior_numero = T;
        }
        else{
            maior_numero = S;
        }
        System.out.println("O maior número entre eles é o "+maior_numero+".");
        return maior_numero;
    }
    public static void main(String[] args) {
        Ex2_maiordostres();
    }
}
