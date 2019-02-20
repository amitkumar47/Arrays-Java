
public class Solution {

	public static int[] merge(int arr[], int arr1[]){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/			
      	int a=0;
			int b =0;
			
			int fin [] = new int [(arr.length + arr1.length)];
			for (int k=0 ; k<(arr.length +arr1.length); k++) {
		
				 if (a>=arr.length) {
					fin [k]= arr1[b];
					b++;
				}
				else if (b>=arr1.length) {
					fin [k]= arr[a];
					a++;
				}
				else if (arr[a]<=arr1[b]) {
				    fin [k]=arr[a];
				    a++;}
				else if (arr[a]>arr1[b]) {
				    fin [k]=arr1[b];
				    b++;}
					
					
				
					
			}
			
			return fin;		
		
	}
	
}
