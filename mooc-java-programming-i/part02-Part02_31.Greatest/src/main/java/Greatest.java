public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int mayor1 = Math.max(number1,number2);
        int mayor = Math.max(mayor1,number3);
        return mayor;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
