import java.util.Scanner;
public class Reverse{

static class SLNode{
public int data;
public SLNode next;

public SLNode(int nodeData){
this.data=nodeData;
this.next=null;

}
}

static class SL{
public SLNode head;
public SLNode tail;

public SL(){

this.head=null;
this.tail=null;

}

public void insertNode(int nodeData){
SLNode node=new SLNode(nodeData);

if(this.head==null){
this.head=node;
}
else{
this.tail.next=node;
}
this.tail=node;

}
}

public static void printSL(SLNode node, String sep){

while(node!=null){
System.out.println(node.data);

node=node.next;

if(node!=null){
System.out.println(sep);
}
}
}

public static void reversePrint(SLNode llist){

if(llist.next!=null){
reversePrint(llist.next);
}

System.out.println(llist.data);
}

private static final Scanner sc = new Scanner(System.in);

public static void main(String[] args){

int t1=sc.nextInt();
sc.skip(" ");

for(int t1Itr =0; t1Itr<t1;t1Itr++){
SL llist= new SL();

int llistCount=sc.nextInt();
sc.skip(" ");

for(int i=0;i<llistCount;i++){
int llistItem=sc.nextInt();
sc.skip(" ");

llist.insertNode(llistItem);
}

reversePrint(llist.head);
}
}

}