import java.util.*;

class Stack
{
   private int[] a;
   private int top,m;
   public Stack(int max)
   {
     m=max;
     a=new int[m];
     top=-1;
   }
   public void push(int key)
   {
     a[++top]=key;
   }
   public int pop()
   {
     return(a[top--]);
   }
}
class Evaluation{
   public int calculate(String s)
   {
     int n,r=0;
     n=s.length();
     Stack a=new Stack(n);
     for(int i=0;i<n;i++)
     {
       char ch=s.charAt(i);
       if(ch>='0'&&ch<='9')
         a.push((int)(ch-'0'));
       else
       {
         int x=a.pop();
         int y=a.pop();
         switch(ch)
         {
           case '+':r=x+y;
              break;
           case '-':r=y-x;
              break;
           case '*':r=x*y;
              break;
           case '/':r=y/x;
              break;
           default:r=0;
         }
         a.push(r);
       }
     }
     r=a.pop();
     return(r);
   }
}
public class Postfix_eval
{
   public static void main(String[] args)
   { Scanner snehil=new Scanner(System.in);
     String input;
     while(true)
     {
       System.out.println("Enter your postfix expresion");
       input=snehil.nextLine();
       if(input.equals(""))
         break;
       Evaluation e=new Evaluation();
       System.out.println("The output of the program is "+e.calculate(input));
     }
   }
   public static String getString()
   {
     Scanner inp=new Scanner(System.in);
     String s=inp.nextLine();
     return s;
   }
}
