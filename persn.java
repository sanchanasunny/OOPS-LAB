
import java.util.Scanner;
class person{
    Scanner sc=new Scanner(System.in);
    String gend,addres,name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.print("Name:");
        name=sc.next();
        System.out.print("Address:");
        addres=sc.next();
        System.out.print("Gender:");
        gend=sc.next();
        System.out.print("Age:");
        age= sc.nextInt();
    }
}

class emplye extends person{
    int emplid,salry;
    String cmpny_name,qualification;
    Scanner sc=new Scanner(System.in);
    emplye()
    {
        System.out.println("Empolyee Details");
        System.out.print("Company Name:");
        cmpny_name=sc.next();
        System.out.print("Employee ID:");
        emplid=sc.nextInt();
        System.out.print("Qualification:");
        qualification=sc.next();
        System.out.print("Salary:");
        salry=sc.nextInt();
    }
}
class tcher extends emplye{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int techrID;
    tcher(){
        System.out.println("Teacher Details:");
        System.out.print("Department name:");
        dept=sc.next();
        System.out.print("Subject:");
        subj= sc.next();
        System.out.print("Teahcer ID:");
        techrID= sc.nextInt();
    }
    void disp()
    {
        System.out.println("Details are:");
        System.out.println(name);
        System.out.println(gend);
        System.out.println(age);
        System.out.println(cmpny_name);
        System.out.println(emplid);
        System.out.println(qualification);
        System.out.println(techrID);
        System.out.println(addres);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salry);
    }
}
public class persn {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=sc.nextInt();
        tcher tr[]=new tcher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new tcher();
            tr[i].disp();
        }
    }
}

		
