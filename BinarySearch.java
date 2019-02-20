public class BinarySearch{	
	//arr is the given sorted array in which you need to find num
	public static int binarySearch(int[] arr, int num){
		//write your code here
      int start=0;
			int end=arr.length-1;
			int mid;
			
			for (int i=0; start<=end ; i++) {
				
				mid=(start+end)/2;
				if (num>arr[mid])
					start = mid +1;
				else if (num<arr[mid])
					end =mid -1;
				else if (num==arr[mid])
					return mid;
					
			}
			return -1;
		
	}
}