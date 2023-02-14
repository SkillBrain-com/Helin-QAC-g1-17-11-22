package java.org.skillbrain.radulescuTeodor.temaExtra;

public class tema2 {

    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Numarul initial: "+num);
        int reverse = reverse(num);
        System.out.println("Numarul inversat: " + reverse);
    }

}
