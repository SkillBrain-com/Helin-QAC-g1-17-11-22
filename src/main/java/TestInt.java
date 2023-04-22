public interface TestInt {

 //  public static final String interfaceName = "TestInt";
 //  public abstract void somethingElse();

    int mediaAritmetica();

    Object objectMethod();
    default void  doSomething(){
        System.out.println("Doing something");
    }
}
