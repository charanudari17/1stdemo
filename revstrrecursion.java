//28-may-26-thu
import java.lang.*;
public class revstrrecursion {
   static String revstr(String s){
        if(s.length()<=1){
            return s;
        }
        return s.charAt(s.length()-1)+revstr(s.substring(0,s.length()-1));
    }
    public static void main(String args[]){
        String s="123123123";
        System.out.print(revstr(s));

    }
    
}
