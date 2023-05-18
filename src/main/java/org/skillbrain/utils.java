package utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static Scanner scanner(){

        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static int random( int i){
        Random random = new Random();
        return random.nextInt(i);
    }

}
