import java.io.*;
import java.util.*;
class arrayqueue
{
int len,front,rear,size;
int queue[]=new int[10];
public arrayqueue(int n)
{
size =n;
len=0;
queue=new int[n];
front=-1;rear=-1;
}
public void insert(int i)
{
if(rear==-1)
{
front=0;rear=0;
queue[rear]=i;
}
else if(rear+1>=size)
System.out.println("overflow");
else if(rear+1<size)
queue[++rear]=i;
len++;
}
public int remove()
{
if(front==-1)
System.out.println("underflow");
else
{
len--;
int de=queue[front];
if(front==rear)
{
front=-1;rear=-1;
}
else front++;
return de;
}return 0;
}
public void peek()
{
if(front==-1)
System.out.println("underflow");
else 
System.out.println(queue[front]);
}
public void display()
{if(front!=-1)
for(int i=front;i<=rear;i++)
System.out.print(queue[i]+" ");
System.out.println();
}
}
class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of queue");
int size=sc.nextInt();
arrayqueue que=new arrayqueue(size);
int ch=0,r;
while(ch!=4)
{
System.out.println("Enter 1 for insert 2 for remove 3 for peek 4 for exit");
ch=sc.nextInt();
if(ch==1)
{System.out.println("Enter element");
int x=sc.nextInt();
que.insert(x);
que.display();
}
else if(ch==2)
{
r=que.remove();
que.display();
}
else if(ch==3)
que.peek();
}
que.display();
}
}
