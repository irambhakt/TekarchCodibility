package ProgrammingQuestions;

public class QuickSort {

	
	public static void main(String[] args) 
	{
		int[] arr = {10,70,80,50,20,5,90,30,8,40,9,60,100};
		int start = 0;
		int end = arr.length - 1;
		quickSort(arr, start,end);
		for(int i : arr)
		{
			System.out.println(i);
		}
	}


	private static void quickSort(int[] arr, int start, int end) 
	{
		if(start < end)
		{
			int partIndex = partition(arr,start,end);
			quickSort(arr, partIndex + 1, end);
			quickSort(arr, start, partIndex - 1);
		}
	}

	private static int partition(int[] arr, int start, int end) 
	{
		int i = start - 1;
		int pivot = arr[end];
		for (int j = start ; j < end ; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = pivot;
		arr[end] = temp;
		return (i+ 1);
	}

}
