
import java.util.*;

public class Basicthing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname = "Prasanna";// Initializing the String
        String lastname = "Dindi";
        String fullname = firstname + " " + lastname;//concatination of string
        System.out.println(fullname);//printing the string 
        String name = sc.nextLine();//input taking
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));// traversing though each and every element using charAt()
        }
    }
}
