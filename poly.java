 public class Node2{
        int coef;
        int exp;
        Node2 next;
        Node2(int c,int e,Node2 n){
            coef=c;
            exp=e;
            next=n;
        }
        Node2(int c,int e){
            coef=c;
            exp=e;

        }


}

public class LinkedPoly{
    static String exponent="";
    Node2 head;
    Node2 current;

LinkedPoly(){
    head=null;

}
public void createList(int c,int e){
    head=new Node2(c,e,head);
}

public static LinkedPoly add(LinkedPoly list1,LinkedPoly list2){
    LinkedPoly addList=new LinkedPoly();

    Node2 temp1=list1.head;
            Node2 temp3=temp1;
    Node2 temp2=list2.head;
            Node2 temp4=temp2;
    while(temp1.next!=null){
        while(temp2.next!=null){
            if(temp1.exp==temp2.exp){

            addList.createList((temp1.coef+temp2.coef),temp1.exp);
            exponent+=temp1.exp;

            }
            temp2=temp2.next;
        }
        temp1=temp1.next;
        temp2=temp4;
    }
    String[] array=exponent.split("");
    for(int i=1;i<array.length;i++){

        while(temp3.next!=null){
            if(temp3.exp!=Integer.parseInt(array[i])){
                addList.createList(temp3.coef,temp3.exp);
            }
            temp3=temp3.next;
        }
        while(temp4.next!=null){
            if(temp4.exp!=Integer.parseInt(array[i])){
                addList.createList(temp4.coef,temp4.exp);
            }
            temp4=temp4.next;
        }
    }

    return addList;
}


public static void main (String args[]){
    LinkedPoly l1=new LinkedPoly();
    l1.createList(3,2);
    l1.createList(5,1);
    l1.createList(3,0);
    LinkedPoly l2=new LinkedPoly();
    l2.createList(4,3);
    l2.createList(5,1);
    l2.createList(2,0);

    LinkedPoly l3=add(l1,l2);
    System.out.println(l3.head.next.next.coef);
}
}
public static LinkedPoly add(LinkedPoly list1,LinkedPoly list2){
    LinkedPoly addList=new LinkedPoly();

    Node2 temp1=list1.head;
    Node2 temp3=temp1;
    Node2 temp2=list2.head;
    Node2 temp4=temp2;
    while(temp1.next!=null){
        while(temp2.next!=null){
            if(temp1.exp==temp2.exp){

                addList.createList((temp1.coef+temp2.coef),temp1.exp);
                exponent+=temp1.exp;

            }
            temp2=temp2.next;
        }
        temp1=temp1.next;
        temp2=temp4;
        addList.print();
    }
    String[] array=exponent.split("");


    while(temp3!=null){
        boolean exponentPresent = false;
        for(int i=1;i<array.length;i++){
            if(temp3.exp==Integer.parseInt(array[i])){
                exponentPresent = true;
            }
        }
        if (!exponentPresent) {
            addList.createList(temp3.coef,temp3.exp);
        }
        temp3=temp3.next;
    }
    while(temp4!=null){
        boolean exponentPresent = false;
        for(int i=1;i<array.length;i++){
            if(temp4.exp==Integer.parseInt(array[i])){
                exponentPresent = true;
            }
        }
        if (!exponentPresent) {
            addList.createList(temp4.coef,temp4.exp);
        }
        temp4=temp4.next;
    }


    return addList;
}





public void print() {
    current = head;
    System.out.print(current.coef + "x^" + current.exp);
    while (current.next != null) {
        current = current.next;
        System.out.print(" + " + current.coef + "x^" + current.exp);
    }
    System.out.println();
}
