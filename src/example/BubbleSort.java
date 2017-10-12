package example;

public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = { 99, -10, 100231, 18, -987,
						5698, 478, -9, 234, 47};
		
		int t;
		
		System.out.println("Orginalna tablica: ");
		for(int i = 0; i< nums.length; i++) {
			System.out.print(" " + nums[i]);
		System.out.println();
		}
		
//		for(int i=1; i<nums.length; i++) 
//			for(int j = nums.length-1; j>=i; j--) {
//				if(nums[j-1] > nums[j]) {
//					t = nums[j-1];
//					nums[j-1] = nums[j];
//					nums[j] = t;
//				}
//			}
		
		for(int i= 0; i < nums.length; i++){
			for(int j=0; j < nums.length-1; j++) {
				if(nums[j] > nums[j+1]) {
					t = nums[j+1];
					nums[j +1] = nums[j];
					nums[j] = t;
				}
			}
		}
			
			System.out.println("Tablica po sortowana");
			for(int i = 0; i< nums.length; i++) 
				System.out.println(" " + nums[i]);
			System.out.println();
			
		}

}