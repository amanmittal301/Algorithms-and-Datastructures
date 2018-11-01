package a;
import java.util.*;
public class mergesort 
{
	public static void mergealgo(int arr[],int start,int mid,int end)
	{
		int n1=mid-start+1;
		int n2=end-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<=n1-1;i++)
		{
			left[i]=arr[start+i];
		}
		for(int i=0;i<=n2-1;i++)
		{
			right[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1&j<n2)
		{
			if(left[i]<right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
	}
	public static void sortalgo(int arr[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergesort.sortalgo(arr, start,mid);
			mergesort.sortalgo(arr, mid+1, end);
			mergesort.mergealgo(arr,start,mid,end);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		mergesort.sortalgo(arr, 0, n-1);
		System.out.println("sorted Array");
		for(int i=0;i<=n-1;i++)
			System.out.print(arr[i]+" ");
	}
}
