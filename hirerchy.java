
import java.util.*;
abstract class publisher
{
    static int pid;
    static String name;
    Scanner sc=new Scanner(System.in);
   publisher()
   {
           System.out.println("Enter publisher details");
           System.out.print("Publiser name:");
           name=sc.next();
       System.out.print("Publiser Id:");
           pid=sc.nextInt();

   }
}
class book extends publisher
{
    String bname;
    int bid;
    Scanner sc=new Scanner(System.in);
    book()
    {
       System.out.println("Book details:");
        System.out.print("Book name");
        bname=sc.next();
        System.out.print("Book Id");
        bid=sc.nextInt();
    }
}
class liter extends book
{
    String chap;
    int chapno;
    Scanner sc=new Scanner(System.in);
    liter()
    {
        System.out.print("Chapter Name:");
        chap=sc.next();
        System.out.print("Chapter number:");
        chapno=sc.nextInt();
    }
}
class fiction extends liter
{
    String topic;
    Scanner sc=new Scanner(System.in);
    fiction()
    {
        System.out.println("Topic");
        topic=sc.next();
    }
    void displ()
    {
		System.out.println();
        System.out.println("Details are:");
        System.out.println("Publisher Name:");
        System.out.println(name);
        System.out.println("Pblisher Id:");
        System.out.println(pid);
        System.out.println("Book name:");
        System.out.println(bname);
        System.out.println("Book Id:");
        System.out.println(bid);
        System.out.println("Chapter:");
        System.out.println(chap);
        System.out.println("Chapter Number");
        System.out.println(chapno);
        System.out.println("Topic:");
        System.out.println(topic);
    }
}
public class hirerchy {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=sc.nextInt();
        fiction tr[]=new fiction[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new fiction();
            tr[i].displ();
        }
    }
}

		output
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
C:\Users\HP\Desktop\java>javac hirerchy.java

C:\Users\HP\Desktop\java>java hirerchy
Enter the limit:
2
Enter publisher details
Publiser name:
abc
Publiser Id:
101
Book details:
Book name
xyz
Book Id
202
Chapter Name:
drama
Chapter number:
300
Topic
lmn
Details are:
Publisher Name:
abc
Pblisher Id:
101
Book name:
xyz
Book Id:
202
Chapter:
drama
Chapter Number
300
Topic:
lmn
Enter publisher details
Publiser name:
pqr
Publiser Id:
102
Book details:
Book name
jkl
Book Id
204
Chapter Name:
poem
Chapter number:
333
Topic
uvw
Details are:
Publisher Name:
pqr
Pblisher Id:
102
Book name:
jkl
Book Id:
204
Chapter:
poem
Chapter Number
333
Topic:
uvw
