

public class Solution{	

	public static void tripletSum(int[] input, int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		*/int n= input.length;
    	for (int i=0 ; i<n ; i++ ) {
			for (int j=i+1 ; j<n ; j++) {
				for (int k=j+1 ;k< n ; k++) {
					if ((input[i]+input[j]+input[k])==x) {
				sorting (input[i],input[j],input[k]);
					             
	         }
			}
			}}
	}
		
		public static void sorting(int a, int b, int c){
		if (a<=b && a<=c) {
			if (b<=c)
				System.out.println(a+" "+b+" "+c);
			else
				System.out.println(a+" "+c+" "+b);
		}
		else if (b<=a && b<=c) {
			if (a<=c)
				System.out.println(b+" "+a+" "+c);
			else
				System.out.println(b+" "+c+" "+a);
		}
		else if (c<=b && c<=a) {
			if (b<=a)
				System.out.println(c+" "+b+" "+a);
			else
				System.out.println(c+" "+a+" "+b);
		}
		}


          }