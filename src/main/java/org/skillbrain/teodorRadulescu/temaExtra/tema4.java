import java.util.Arrays;

public class tema4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 5, 7, 9};
        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                array3[i] = array1[i];
            }
        }

        System.out.println(Arrays.toString(array3));
    }

}
