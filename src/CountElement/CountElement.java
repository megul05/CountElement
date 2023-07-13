package CountElement;
import java.util.*;

public class CountElement {
	
	public static int MaxCount(int arr[],int max,int size)
	{
		int counter=0;
		for(int i =0;i<size;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i] == max)
			{
				counter++;
			}
		}
		return size - counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}	
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		System.out.println( MaxCount(arr,max,size));
		
	}

}
