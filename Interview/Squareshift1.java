package DataStructure.Interview;

import java.util.Stack;

public class Squareshift1 {
    public static void main(String[] args) {
        //testtsr -> ter
        //testtss -> tes
        //testktest -> testktest
        String str="testktest";
        removeConsucutive(str);

    }
    public static void removeConsucutive(String str){
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(s.isEmpty()){
                s.push(str.charAt(i));
            }
            else{
                if(s.peek()==str.charAt(i)){
                    s.pop();
                }else{
                    s.push(str.charAt(i));
                }
            }
        }
        StringBuffer result=new StringBuffer();
        while(!s.isEmpty()){
            result.append(s.pop());
           
        }
        System.out.println("resultent string "+result.reverse().toString());
    }
}
