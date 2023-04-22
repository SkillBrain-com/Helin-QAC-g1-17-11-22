
public class SwitchTestChild extends SwitchTest{

     private  String name1;
     private  int number;
     private Object obj;

   //  public  SwitchTestChild(){}

    public SwitchTestChild() {
       super();
    }

    public  SwitchTestChild(String c) {
        name1 =c;
    }
   public SwitchTestChild(int b) {
        this("B");
   }



    public static void main(String[] args) {

        SwitchTest test = new SwitchTestChild();

    }


    public  SwitchTestChild(String name, int number) {
         this.name1 = name;
         this.number = number;
     }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }


    //    Object abc = new String();
       // Object bcd = new Object();
    //    Object bcd = new String();
         // cum functioneazza instantierea
        //in stanga am tipul de referinta  in dreapta am tipul de obiect
    //    System.out.println(System.identityHashCode(abc));
    //    System.out.println(System.identityHashCode(bcd));



        // System.out.println(abc == bcd);
    //    System.out.println(abc.equals(bcd));

             // Bucla FOR
    //    for(;;) {
    //        System.out.println("bucla");
    //    }





    }

