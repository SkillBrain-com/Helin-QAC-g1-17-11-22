
public class Calculus implements TestInt{

    public static void main(String[] args) {
        Calculus calculus = new Calculus();
                      // Overloading-ul
        //calculus.mediaAritmetica();
        // calculus.mediaAritmetia(10);
      //calculus.mediaAritmetica(10,20);



    }



    @Override
    public int mediaAritmetica() {
        return 0;
    }
           // exemplu de overloading
    public int mediaAritmetia(int a){
        return  a;
    }

   public int mediaAritmetica(int a, int b){
        return  (a+b)/2;

   }


    @Override
    public Calculus objectMethod() {
        return null;
    }
}
