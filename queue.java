import java.util.*;
public class queue
{
int arr[],front,rear,size;
public queue(int s)
{
size =s ;
front=-1;
rear=-1;
arr=new int[size];
}
void nque(int key)
{

System.out.println("dque starts u are not able to add now:");


if(front==-1)
{
++rear;
++front;
arr[rear] = key;
for(int i=front;i<rear;++i)
{
System.out.println(arr[i]+" ");

}


}
else if((rear<size) &&(front==0)){
++rear;
arr[rear] = key;

for(int i=front;i<rear;++i)
{
System.out.println(arr[i]+" ");

}
 if(rear==size){

System.out.println("Queue full!!!");


}
/*
else{

System.out.println("not possible");
}*/


}



}
void dque()
{
if (front==-1)
{
System.out.println("nothing in queue");
}

else if((front==rear)&& ((front+1)==size))
{
System.out.println("queue ended");
}
else
{
System.out.println("dque starts u are not able to add now:");
++front;
for(int i=front;i<size;i++){
System.out.println(arr[i]+ " ");

}
}
}

void peek()
{
if(front==-1)
{
System.out.println("nothing in queue");
}
else if((front==rear)&& ((front+1)==size))
{
System.out.println("queue ended");
}
else{

System.out.println("peek of queue:"+arr[front]);
}

}
/*
void display(){

if(front==-1)
{
System.out.println("nothing in queue");
}
else if()

}*/




public static void main(String arg[])
{

Scanner robo= new Scanner(System.in);
int op=1,log;
System.out.println("enter size of queue:");
int a =robo.nextInt();
queue snehil  =new queue(a);

while(op!=0){
System.out.println("Press 1 for nque ");
System.out.println("Press 2 for dque ");
System.out.println("Press 3 for peek ");
System.out.println("Press other key to quit");
int choice= robo.nextInt();
if(choice==1)
{
if(snehil.rear<snehil.size){
System.out.println("enter the no to add in the queue:");
log = robo.nextInt();
snehil.nque(log);}}


else if(choice==2){

System.out.println("dque starts u are not able to add now:");
snehil.dque();
}


else if(choice==3){

System.out.println("peek");
snehil.peek();

}

else{

break;
}
System.out.println("enter the number except 0, 0 for stop:");
op=robo.nextInt();


}
}

}
