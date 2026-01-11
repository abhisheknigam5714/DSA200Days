package sorting;

public class Slection {

	public static void selection(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	}
	
	
	
	
public static void bubbleSort(int [] arr) {
	
	
	
	for(int i=0;i<=arr.length-2;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]>=arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		
}
	public static  void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	
	
	public static void insertionSort(int [] arr) {
		int length=arr.length;
		int i=0;
		int j=i+1;
		while(i<j && j<=length-1) {
			
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				
			}
			else if(arr[j]<arr[i]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
	}
	
	public static void main(String [] args) {
		int[] arr= {5,1,1,1,6,2};
		//selection(arr);
		insertionSort(arr);
		//bubbleSort(arr);
		printarr(arr);
	}
}
