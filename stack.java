import java.io.*;
import java.util.*;
public class stack
{
int arr[];
int top;
int size;
public stack(int q)
{
size=q;
top=-1;
arr=new int[q];
}
  public void push(int a)
	{
	if(top<size)
	{
	top=top+1;
	arr[top]=a;
	}
	else
	System.out.println("Over flow");
	}
  public void pop()
	{
	if(top>=0)
	{
	top--;
	}
	else
	System.out.println("Under flow");
	}
  public void peek()
	{
	if(top<size)
	{
	System.out.println(arr[top]);
	}
	else if(top<0)
{          top=-1;
	System.out.println("stack Empty");
	}
	else
	{
	System.out.println("stack Empty");
	 }
}
 public static void main(String arg[])
	{
	Scanner rohit=new Scanner(System.in);
	int key,flag,op;
	System.out.println("Enter the size of Stack ");
	flag=rohit.nextInt();
	stack st=new stack(flag);
	


while(true)
{
System.out.println("Press 1 for push ");
System.out.println("Press 2 for pop ");
System.out.println("Press 3 for peek ");
key=rohit.nextInt();
	
	if(key==1)
	{ if(st.top<st.size-1)
		{
			System.out.println("Give the content  for push ");
			flag=rohit.nextInt();	
			st.push(flag);
			for(int i=0;i<=st.top;i++)
			{
			  System.out.print(st.arr[i]+ " ");
			

			}
			System.out.println(" ");
		}
	else
	{
	System.out.println("full");
	}
}	

	else if(key==2)
	{	st.pop();
		for(int i=0;i<=st.top;i++)
		{
		  System.out.print(st.arr[i]+ " ");
		}
	System.out.println(" "); 
	}

	else if(key==3)
	{
	if(st.top>=0)
	{
	st.peek();
	System.out.println(" ");
	}
	else
	{
	System.out.println("stack empty");
	}
	}

	else
	{
	System.out.println("Invalid");

	}
System.out.println("Press 0 to stop and any other to cont..");
	op=rohit.nextInt();
}
}
}

