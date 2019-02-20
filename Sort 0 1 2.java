public class Sort012{	

	public static void sort012(int[] arr){
		/* Your class should be named Sort012
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */ int k=arr.length-1;
            int j=0;
       for (int i = 0 ; i<=k ; i++){
             if (arr[i]==0){
               arr[i]=arr[j];
               arr[j]=0;
               j++;
               
               
             } 
             else if (arr[i]==1){
               
               
             }
             else if (arr[i]==2){
               arr[i]=arr[k];
               arr[k]=2;
               k--;
               i--;
               
             }  
         
       }
	}
}