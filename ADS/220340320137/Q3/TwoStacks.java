class TwoStacks{
int size;
int top1, top2;
int arr[];

TwoStacks(int n){
arr = new int[n];
size= n;
top1 = -1;
top2 = size;

}

void push1(int x){

if(top1 < top2 - 1){
top1++;
arr[top1] = x;
}
else{
System.out.println("Stack Overflow");
System.exit(1);
}
}

void push2(int x){

if(top1 < top2 - 1){
top2--;
arr[top2] = x;
}

else{
System.out.println("Stack Overflow");
System.exit(1);
}
}

int pop1(){
if(top1>=0){
int x =arr[top1];
top1--;
return x;
}

else{
System.out.println("Stack underflow");
System.exit(1);
}
return 0;
}

int pop2(){
if(top2 < size){
int x =arr[top2];
top2++;
return x;
}

else{
System.out.println("Stack underflow");
System.exit(1);
}
return 0;
}

public static void main(String[]args){

TwoStacks t1 = new TwoStacks(5);
t1.push1(5);
t1.push2(10); 
t1.push2(15); 
t1.push1(11);
System.out.println("popped element from stack 1 "+t1.pop1()); 
t1.push2(7); 
t1.push2(40);
System.out.println("popped element from stack 2 "+t1.pop2());

}
}