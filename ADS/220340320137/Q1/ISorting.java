public class ISorting{

void insertionsort(int a1[]){

int n= a1.length;
for(int i=1;i<n;i++){

int k=a1[i];
int j=i-1;

while(j>=0 && a1[j]>k){

a1[j+1]=a1[j];
j=j-1; 
}

a1[j+1]=k;
}
}

void display(int a1[]){
	int n=a1.length;
	for(int i=0;i<n;i++){
		System.out.print(a1[i]+" ");
	}
}

public static void main(String args []){
	ISorting s1=new ISorting();
	int a1[]={1,2,4,5,3};
	
	int n = a1.length;
	System.out.println("Elements before Insertion Sorting");
	s1.display(a1);
	s1.insertionsort(a1);
	System.out.println(" ");
	System.out.println("Elements after Insertion Sorting");
	s1.display(a1);
	
}
}