import java.util.Random;
import java.util.Scanner;
class SelectionSort 
{
	void sort(int a[],int n)
	{  for(int i=0; i<n; i++)
	{
		int min_element=i;
	for(int j=i+1; j<n; j++)
	{ 
		if(a[j]<a[min_element])
			min_element=j;
	}
	int temp=a[min_element];
	a[min_element]=a[i];
	a[i]=temp;
	}
	}
	public static void main(String[] args)
	{ int[]a;
	int i;
	System.out.println("Enter the array size");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	a=new int[n];
	Random generator=new Random();
	for(i=0;i<n;i++)
a[i]=generator.nextInt(40);
System.out.println("Array before sorting");
for(i=0;i<n;i++)
	System.out.println(a[i]+" ");
long startTime=System.nanoTime();
SelectionSort ss=new SelectionSort();
ss.sort(a,n);
long stopTime=System.nanoTime();
long elapseTime=(stopTime-startTime);
System.out.println("Time taken to sort array is:"+elapseTime+"nanoseconds");
System.out.println("Sorted array is");
for(i=0;i<n;i++)
	System.out.println(a[i]);
	}
	}
