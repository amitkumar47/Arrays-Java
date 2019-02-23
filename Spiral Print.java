public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
            
         int n=matrix.length;
	      int m=matrix[0].length;
	      int counter=0;
	      int rs=0;
	      int re=n-1;
	      int cs=0;
	      int ce=m-1;
	      
	      while (counter<(n*m)){
	        
	        for (int i=cs ; i<=ce ; i++){
	          System.out.print(matrix[rs][i]+" ");
	          counter++;
	          if (i==ce)
	        	  rs++;
	        }
	        
	        for (int i=rs ; i<=re ; i++){
	          System.out.print(matrix[i][ce]+" ");
	          counter++;
	          if(i==re)
	        	  ce--;
	        }
	        for (int i=ce ; i>=cs ; i--){
	          System.out.print(matrix[re][i]+" ");
	          counter++;
	          if (i==cs)
	        	  re--;
	        }
	        for (int i=re ; i>=rs ; i--){
	          System.out.print(matrix[i][cs]+" ");
	          counter++;
	          if (i==rs)
	        	  cs++;
	        }
	}      
    	}
}