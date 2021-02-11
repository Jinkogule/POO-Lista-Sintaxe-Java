public class Ex3 {
    public static void main(String[] args) {
        int num_atual = 1;
        int soma = 0;
        while (num_atual < 1000){
            soma += num_atual;
            num_atual+=1;
        }
        System.out.println("A soma de 1 até 999 é: "+soma+".");
    }
}
