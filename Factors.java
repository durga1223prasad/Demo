import java.util.Scanner;

public class Factors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printFactors(number);

        scanner.close();
    }
    static void printFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { 
System.out.print(i);
                if(i!=num)System.out.print(",");
            }
        }
    }
}