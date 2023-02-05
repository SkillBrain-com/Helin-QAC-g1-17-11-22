public class AltaClasa {

    public static void main(String[] args) {
//        int x = 10;
//        int y = -12;
//
//        int suma = x +y;
//
//        System.out.println("suma =" + suma);
//
//        /*
//
//
//        Mai multe linii de cod
//
//
//
//         */
//
//        int a = 10;
//        int b = -12;
//
//        int suma1 = a +b;
//
//        System.out.println("suma =" + suma1);


        // functiile se definesc in afara altor metode !!!!!


        int suma = adunarenumere(10, 20);
        suma = adunarenumere(500, 800);
        suma = adunarenumere(12, 88);
        System.out.println(suma);

        suma = scadereNumere(500, 100);
        System.out.println(suma);


    }



    // toate metodele trebuie sa aiba () astfel se face diferenta intre metoda si variabila

    static int scadereNumere(int a, int b){
        return a - b;
    }


    static int adunarenumere( int a, int b ){

        int suma = 0;
        suma = a + b;
        return suma;

    }






}
