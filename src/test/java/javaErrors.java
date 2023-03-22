import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class javaErrors {
    //cuvinte cheie pentru tratarea exceptiilor(erorilor)in limbajul java
    //1.throw -- il folosim atunci cand vrei sa aruncam explicit o anumita exceptie(eroare)
    //2. throws -- atentioneaza conpilatorul ca o metoda sau un constructor arunca oexceptie (eroare)
    //3. try- catch -finally --blocuri de cod unde putem sa ne definim anumite Handler-e pentru exceptiile(erorile) noastre


              //Virtual Machine error
       // Error-->
                //Assertion Error
//Object -->Throwable-->

                //Checked Exceptions[(Ex: IO or compile time Exception(depistate la conpilare))]
    // Exceptions-->
                 // Unckecked Exceptions[(Ex: Runtime or NullPointerException(depistate la run-time)]

                         //throws IOException
    public static void main(String[] args) throws IOException {
//        checkedExceptions();
//        uncheckedExceptions();
//        metodaRecursiva(5, i);
        // int i = 1;
        // System.out.println("S-a terminat metoda main");

                     //3. TRY-CATCH -FINALLY
        // try {
        // String cuvant = null;
        //   String cuvant = "un oarecare string";//cu aceasta linie de cod rezultatul nu este NullPointerException
        //   String rezultat = cuvant.toLowerCase();
        //   System.out.println("Rezultattul este:" +rezultat);


        //}catch (NullPointerException e){
        //   System.out.println("Am intrat in blocul de catch");
        //}
        //System.out.println("S-a terminat metoda main");

                             //METODA CHECKED EXCEPTION IN BLOC DE TRY
        // try {
        //   checkedExceptions();
        //}catch (IOException e){
        //  System.out.println("AM intrat in blocul de catch - checked exceptions ");
        //}
        //System.out.println("S-a terminat metoda main");

                              //ARITHMETICEXCEPTION IN BLOC DE TRY
        //  try {
                                 //checkedExceptions();

        //String cuvant = null;
        //        String cuvant = "null";// generam un ArithmeticException
        //String cuvant = "un oarecare string";//cu aceasta linie de cod rezultatul nu este NullPointerException
        //        String rezultat = cuvant.toUpperCase();//Linie de cod folosita pentru ArithmeticException in bloc de try
        //    System.out.println("Rezultattul este:" +rezultat);
        //         int a = 10;
        //         int b = 0;
        //        int result = a / b;
        //        System.out.println("Dupa ArithmeticException");
        //catch (NullPointerException | ArithmeticException e){
        //    }catch (Exception e){
        // System.out.println("Am intrat in blocul de catch - NullPointerException");
        //}catch (ArithmeticException e){
        //  System.out.println("Am intrat in blocul de catch - ArithmeticException");
        //        System.out.println("Am intrat in blocul de catch");
        // uncheckedExceptions();
        //System.out.println(e.getCause());
        //        System.out.println(e.getMessage());//printeaza mesajul
        //        e.printStackTrace();// nu opreste executia programului
        //    }
        //    System.out.println("S-a terminat metoda main"); }

                                  //Blocul de finally
        //    try {
        //        String cuvant = "cuvant  random";
        //String cuvant = null;// generam un NullPointerException
        //        String rezultat = cuvant.toUpperCase();
        //        System.out.println("Rezultattul este:" + rezultat);
        //        int a = 10;
        //        int b = 2;
        //        int result = a / b;
        //        System.out.println("Dupa ArithmeticException");
        //}catch (NullPointerException e){
        // System.out.println("Am intrat in blocul de catch");

        //    } finally {
        //        System.out.println("Am intrat in blocul de finally");
        //    }
        //    System.out.println("S-a terminat metoda main");

                          //Sa prindem erorile folosind metoda Recursiva


     //      try {


    //        metodaRecursiva(5, 1);
    //        } catch (Error e) {
    //        System.out.println("Am intrat in blocul de catch");
    //           }finally{
    //         System.out.println("Am intrat in blocul de finally");
    //        }
    //         System.out.println("S-a terminat metoda main");

                             //THROW


        try {
            //throw new MyCustomException("Am trimis mesajul custom");
            throw new IOException("Am trimis mesajul custom");
        }catch (MyCustomException e){
            System.out.println("Am intrat in ramura catch");
        }
        System.out.println("S-a terminat metoda main");


    }


    public static void throwsException(){
        throw new ArithmeticException();
    }

    public static void exemplifyTryCatch() {
        try {

            String cuvant = "cuvant  random";
            String rezultat = cuvant.toUpperCase();
            System.out.println("Rezultattul este:" + rezultat);

            int a = 10;
            int b = 2;
            int result = a / b;
            System.out.println("Dupa ArithmeticException");
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Am intrat in blocul de catch");

        } finally {
            System.out.println("Am intrat in blocul de finally");
        }

            System.out.println("S-a terminat metoda main");


    }



    // Checked exception
    public static void checkedExceptions() throws IOException {//CTRL+Click Stanga; Alt+ENTER
        FileReader file = new FileReader("C:\\Users\\Lenovo\\Desktop\\TEXT.txt");
        // FileReader file = new FileReader("");// folosim aceasta linie de cod pentru a genera o eroare
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }


    //Unchecked exceptions
    public static void uncheckedExceptions() {
        // NULPointerExceptions
        //    String cuvant = null;
        //    cuvant.length();

        //ArithmeticExcepiton
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println("Rezultatul este:" + result);
    }

    public static void metodaRecursiva(int numar, int i) {
        if (numar == 0) {
            return;
        } else {
            System.out.println("Numarul este:" + i);
            i++;
            metodaRecursiva(numar, i);
        }

    }

}
