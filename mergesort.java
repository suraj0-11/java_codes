
import java.util.Random;
import java.util.Scanner;



public class mergeSort {
	static int max=10000;
	void merge(int[]array, int low,int mid,int high)
	{
		int i=low,j=mid+1,k=low;
		int[]resarray;
		resarray=new int[max];
		while(i<=mid && j<=high)
		{
			if(array[i]<array[j])
			{
				resarray[k++]=array[i++];
			}
			else
			{
				resarray[k++]=array[j++];
			}
		}
				while(i<=mid)
				{
					resarray[k++]=array[i++];
				}
				while(j<=high)
				{
					resarray[k++]=array[j++];
				}
				for(int m=low;m<=high;m++)
				{
					array[m]=resarray[m];
				}
	}
	void sort(int[]array,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			sort(array,low,mid);
			sort(array,mid+1,high);
			merge(array,low,mid,high);
		}
	}

	public static void main(String[] args) {
		int[]a;
		int i;
		System.out.println("enter array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		Random generator=new Random();
		for(i=0;i<n;i++)
				a[i]=generator.nextInt(10000);
		System.out.println("array before sorting");
		for(i=0;i<n;i++)
		System.out.println(a[i]+"");
		Long startTime=System.nanoTime();
		mergeSort m =new mergeSort();
		m.sort(a,0,n-1);
		Long stopTime=System.nanoTime();
		Long elapseTime=(stopTime-startTime);
		System.out.println("time taken to sort array is:"+elapseTime+"nanoseconds");
		System.out.println("sorted array is");
		for(i=0;i<n;i++)
		System.out.println(a[i]);


	}

}
