import java.util.Scanner;
public class search
{
public static void main (String[] args)
{
int a[] = new int[10];
Scanner sc = new Scanner(System.in);
System.out.println("enter the limit of array: ");
int rows = sc.nextInt();
for(int i=0;i<rows;i++)
{
a[i] = sc.nextInt();
}
System.out.println("enter key ");
int key = sc.nextInt();

for(int i=0;i<rows;i++) 
{
if(a[i]==key){
System.out.println("found at "+(i+1));
System.exit(0);
}

}

System.out.println("not found");
}}
