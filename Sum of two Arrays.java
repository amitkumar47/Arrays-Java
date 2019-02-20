public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		/* Your class should be named SumOfTwoArrays
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return the output array. No need to print.
		 * Taking input and printing output is handled automatically.
		 */
       int size=0;
		       int n1=arr1.length;
		       int n2=arr2.length;
		       
		      if (n1>=n2)
		        size=n1+1;
		      else
		        size=n2+1;
		      
		      int fin[] = new int [size];
		      int a=0;
		      int b=0;
		      int sum=0;
		      int rem=0;
		      for (int i=size-1 ;  i>=0; i--){
		        
		        if (n1<=a && n2>a)
		          sum=arr2[n2-1-a]+rem;
		        else if (n2<=a && n1>a)
		          sum=arr1[n1-1-a]+rem;
		        else if (i==0)
		        	sum=rem;
		        
		        else
		          sum=arr1[n1-1-a]+arr2[n2-1-a]+rem;
		        
		        if (rem==1)
		              rem=0;
		        
		        fin[i]=sum%10;
		        if (sum>=10)
		          rem=1;
		          
		        a++;
		        
		      }
		      
		     return fin;
	}
}