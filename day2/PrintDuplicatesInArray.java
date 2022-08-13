package week1.day2;

public class PrintDuplicatesInArray {


	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
		int len = arr.length;
		System.out.println("length is:" + len);
		// get the length of the array // declare an int variable named count
		int count;

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int j = 0; j < len- 1; j++)
		// assign 0 to count
		{
			count = 0;
			for (int i = j + 1; i < len; i++) {
				if (arr[j] == arr[i])
				{
					count=count+1; 
					
				}

				// Out of the inner loop, check and print the first array variable if count is
				// more than 0
			}
			
			if(count > 0)
			{ 
				System.out.println("Duplicates are: "+arr[j] ); 
			}
		

		}

	}
}