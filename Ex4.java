public class Ex4 {
    public static void main(String[] args) {
        int num_atual = 1;
        System.out.println("Múltiplos de 3 entre 1 e 100:\n");
        while (num_atual < 100){
            if (num_atual%3 == 0){
                System.out.print(num_atual+" ");
            }
            num_atual+=1;
        }
    }
}
