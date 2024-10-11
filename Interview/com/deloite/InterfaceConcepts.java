package DataStructure.Interview.com.deloite;


interface Test {
    void m1();
    default  void m2(){ // can I use any other Access Modifiers like public default?
        System.out.println("default method implementation");
    }
}
public class InterfaceConcepts implements Test{
    @Override
    public void m1(){
        System.out.println("overriding the m1 method");
    }
    public void hello(){
    	Test.super.m2();
    	//Test.m2();
        //how to access the default method m2?
        //what if the  method m2 is static?
    	
    	
    }
}