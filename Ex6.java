public class Ex6 {
    public static void Ex6_fibo(int N){
        int primeiro = 0;
        int segundo = 1;
        System.out.println("Sequência de Fibonacci até passar de 100:\n1º número: "+primeiro+"\n2º número: "+segundo);
        for (int i=0; i<N-2; i++){
            int restantes = primeiro+segundo;
            primeiro = segundo;
            segundo = restantes;
            System.out.println(i+3+"º termo: "+restantes);
        }
    }
    public static void main(String[] args) {
        Ex6_fibo(500); //resultado passa de 100"
    }
}
