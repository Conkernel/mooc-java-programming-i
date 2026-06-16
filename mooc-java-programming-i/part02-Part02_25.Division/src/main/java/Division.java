import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());
        
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        division( n1, n2);
    }

    public static void division(int n1, int n2) {
        double res = n1/(double)n2;
        System.out.println(res);
    }
}
