class Bubble {
	public static void main(String args[]){
	int nums[] = { 23, 45, -67, 81, 123, 47 };
	int a,b,t;
	int size;

	size = 6;

	// display original array
	for(int i = 0; i < size; i++)
		System.out.println(" " + nums[i]);
	System.out.println();

	// bubble sort
	for(a = 1; a < size; a++){
		for(b = size - 1; b >= a; b--){
			if(nums[b-1] > nums[b]){
				t = nums[b];
				nums[b] = nums[b-1];
				nums[b-1] = t;
			}
		}
	}

	System.out.println("Sorted array is: ");
	for(int i = 0; i < size; i++)
		System.out.println(" " + nums[i]);
	System.out.println();

	}
}
		
