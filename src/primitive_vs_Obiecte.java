import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class primitive_vs_Obiecte {

    public static void main(String[] args) {

//        int A = 100; // primitiv = doar memoreaza o valoare     -> ii dau doar valori
//        Integer var = 100; // obiect (non-primitiva) = face mai multe lucruri  -> ii dau valori + apelez si metode
//        var.equals(A); // apelez si metode
//        System.out.println(var.equals(A)); // variabila "var" (tatal) este egala cu var "A" (copilul)
//
//        System.out.println(10 < 11 ? "adevarat":"fals");
//        // ECHIVALENT
//        if (10 > 11) {
//            System.out.println("adevarat");
//        } else {
//                System.out.println("fals");
//            }

        // pentru interviu intrebari
        // despre variabile, ce sunt, cum le folosim, de ce avem mai multe variabile, diferenta dintre non-primitivele
        // si primitive, operatorii relationali

//        int a = 25;
//        if (a++ < 26) {
//            System.out.println(a++);
//        }

        int a = 3;
        m(++a, a++); // m(4, 4); -> a= 5;
        System.out.println(a);


        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;
        System.out.println(!flag1 == flag2 != flag3 == !flag4);

        // ((!flag1) == flag2) != flag3) == (!flag4))
        // (false == flag2) != flag3) == true)
        // (true != flag3) == flag4)
        // false == true
        // false






    }

    static void m(int i, int j){
        i++;
        j--;
    }









}
