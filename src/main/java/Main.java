import java.util.Scanner;

//ispisi brojeve od 1 do n cija je suma cifara djeljiva sa brojem i
public class Main {
    public static int sumaCifara(int n){
        int cifra, suma = 0;
        while (n > 0) {
            cifra = n % 10;
            suma += cifra;
            n /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            int suma = sumaCifara(i);
            if (i % suma == 0)System.out.print(i+" ");
        }
    }
}