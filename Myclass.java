
import java.util.*;
class overload{
    Scanner sc=new Scanner(System.in);
    int length,breath;
    void get()
    {
        System.out.println("Enter Length,Breath of rectangle:");
        length=sc.nextInt();
        breath=sc.nextInt();
    }
    void area(){
        System.out.println("Area of rectangle:"+(length*breath));
    }
    void area(double pi,int breath,int height){
        System.out.println("Area of triangle:"+(pi*breath*height));
    }
}
public class Myclass {
    public static void main(String ...a) {
        overload ar = new overload();
        ar.get();
        ar.area();
        ar.area(0.5, 4, 5);
    }

}

			output
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
C:\Users\HP\Desktop\java>javac Myclass.java

C:\Users\HP\Desktop\java>java Myclass
Enter Length,Breath of rectangle:
10
5
Area of rectangle:50
Area of triangle:10.0