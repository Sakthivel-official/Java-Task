package arrayQuestion;

public class FintLargestbwtowArray {

	static int findlargest(int[] arr1, int[] arr2) {
		
		//invoke the larg method to find largest elements in an array 
		int a1largest = larg(arr1);
		int a2largest = larg(arr2);
		
		//compare the two array largest "element" which is greater
		if(a1largest == a2largest) {
			System.out.println("Both large element are equal");
		}
		else if(a1largest > a2largest){
			return a1largest;
		}
		else {
			return a2largest;
		}
		
		return -1;
	}
	
	//method to find one array largest element  -> for invoke many time
	static int larg(int arr[]) {
		
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {

		int[] arr1 = {43,24,95893859,42,4,633333,5,24,65,425,7454};
		int[] arr2 = {423,24,24,633333,24,5,4,2,76};
		
		int n = findlargest(arr1, arr2);
		
		System.out.println(n);
		
	}

}
