
public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){
		
		// Write your code here
        int n= input.length;
        int m = input[0].length;
      
      for (int j=0 ; j<m ; j++){
       
        
        for (int i=0 ; i<n ; i++){
          if (j%2==0)
           System.out.print(input[i][j]+" ");
          else 
            System.out.print(input[n-1-i][j]+" ");
          
        }
        
          
        
            
            
      }    
            
            
	}

	
}
