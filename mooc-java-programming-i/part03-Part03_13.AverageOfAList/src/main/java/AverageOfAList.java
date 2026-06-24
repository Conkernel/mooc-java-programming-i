
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> nums = new ArrayList<>();
        double suma=0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            nums.add(number);
        }   
        for (int numero: nums){
            suma+=numero;
        }

        System.out.println("Average: "+ (double) suma/nums.size());        
    }
}
