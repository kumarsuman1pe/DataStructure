package DataStructure.Interview.com.Laerdal;

public class StringConcepts {
    public static void main(String[] args) {
        doSomething(null);
    }

    private static void doSomething(Object object) {
        System.out.println("do something by Object reference..");
    }
      
    private static void doSomething(String string) {
        System.out.println("do something by String reference.. ");
    }
}
