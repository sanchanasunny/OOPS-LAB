
import java.util.*;
class overload{
    Scanner sc=new Scanner(System.in);
    int length,breath;
    void getdata()
    {
        System.out.println("Enter Length and Breath for rectangle:");
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
public class AreaShapes {
    public static void main(String ...a) {
        Scanner sc=new Scanner(System.in);
        overload ov = new overload();
        ov.getdata();
        ov.area();
        System.out.println("Enter Base and height for triangle");
        int c=sc.nextInt();
        int b=sc.nextInt();
        ov.area(0.5, c,b);
    }

}