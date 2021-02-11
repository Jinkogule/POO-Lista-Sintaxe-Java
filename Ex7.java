import java.util.Scanner;

public class Ex7 {
    public static void Ex7_notafuncionarios(){
        Scanner teclado = new Scanner(System.in);

        int cont_funcionarios = 0;

        int cont_pessimas = 0;
        int cont_ruins = 0;
        int cont_boas = 0;
        int cont_otimas = 0;

        int resposta = 0;
        while (resposta>=0 && resposta<=100){
            cont_funcionarios+=1;

            System.out.print("Funcionário "+cont_funcionarios+" - Nota: ");
            resposta = teclado.nextInt();

            if (0<=resposta && resposta<=25){
                cont_pessimas+=1;
            }
            else if (resposta>25 && resposta<=50){
                cont_ruins+=1;
            }
            else if (resposta>50 && resposta<=75){
                cont_boas+=1;
            }
            else if (resposta>75 && resposta<=100){
                cont_otimas+=1;
            }
            else{
                System.out.println("Pesquisa de opinião dos funcionários sobre as refeições:");
            }
        }
        float percent_pessimas = (float)cont_pessimas/cont_funcionarios*100;
        float percent_ruins = (float)cont_ruins/cont_funcionarios*100;
        float percent_boas = (float)cont_boas/cont_funcionarios*100;
        float percent_otimas = (float)cont_otimas/cont_funcionarios*100;

        System.out.println(String.format("%.2f%% dos funcionários consideram que as refeições são péssimas.", (percent_pessimas)));
        System.out.println(String.format("%.2f%% dos funcionários consideram que as refeições são ruins.", (percent_ruins)));
        System.out.println(String.format("%.2f%% dos funcionários consideram que as refeições são boas.", (percent_boas)));
        System.out.println(String.format("%.2f%% dos funcionários consideram que as refeições são ótimas.", (percent_otimas)));
    }

    public static void main(String[] args) {
        Ex7_notafuncionarios();
    }
}
