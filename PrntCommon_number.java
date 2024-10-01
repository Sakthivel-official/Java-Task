
//1.Write a Java program to reverse an array of integer values.
//2.Write a Java program to find common elements between two integer arrays.

public class PrntCommon_number {
	
	static String commonNum(int[] arr1,int[] arr2) {
		
		String commonNum = "";
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					commonNum += arr1[i];
					commonNum +=" ";
				}
			}
			
		}
		
		return commonNum;
	}

	public static void main(String[] args) {

		int[] arr1 = {32,12,43,64,76};
		int[] arr2 = {43,2,64,87,76,12};
		
		String num = commonNum(arr1,arr2);
		System.out.println(num);
		
	}

}
