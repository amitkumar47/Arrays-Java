public class Sort012{	

	public static void sort012(int[] arr){
		/* Your class should be named Sort012
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */for (int i=1 ; i<arr.length ; i++) {
				int j=i-1;
				int temp = arr[i];
				for ( j=i-1 ; j>=0 && arr[j]>temp ; j--) {
						arr[j+1]=arr[j];
				}

				arr[j+1]=temp;
				
			}

	}
}