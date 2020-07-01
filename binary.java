package search;
import java.util.*;
public class binary {
	String binarySearch(int A[], int l, int r, int key, int count) 
    { 
		 int m;
		
		 
		    while( r - l > 1 )
		    {
		        m = l + (r-l)/2;
		 
		        count++;
		       // System.out.println(l+":left jokhon  "+count);
		        if( A[m] <= key )
		            l = m;
		        else
		            r = m;
		    }
		 
		    count++;
		    //System.out.println(l+":lrigt jokhon  "+count);
		    if( A[l] == key )
		        return l+ " key & "+count;
		    else
		        return "-1";
            
        } 
	
	String BinarySearch(int A[], int l, int r, int key,int count1) 
	{ 
	    int m; 
	  
	    while( l <= r ) 
	    { 
	        m = l + (r-l)/2; 
	        count1++;
	       // System.out.println(l+":left jokhon  "+count);
	        if( A[m] == key ) // first comparison 
	            return m+ " key & "+count1; 
	        count1++;
	        //System.out.println(l+":left jokhon  "+count);
	        if( A[m] < key ) // second comparison 
	            l = m + 1; 
	        else
	            r = m - 1; 
	    } 
	  
	    return "-1"; 
	} 
  
        // We reach here when element is not present 
     
	String  binarySearchRecursive(int[] array, int key, int low, int high,int count2) {
	    int mid = low + (high-low) / 2;
	    if (high < low)return "-1";
	    count2++;
	    if (key == array[mid])return mid+ " key & "+count2;
	    if (key < array[mid])return binarySearchRecursive(array, key, low, mid - 1, count2);
	    else return binarySearchRecursive(array, key, mid + 1, high,count2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner (System.in);
				Random rand = new Random();
			    
				int[] x = new int[65536];
				x[0]=9;
				for(int i=0; i<x.length-1; i++){
		        	x[i+1] = x[i]+rand.nextInt(10);
		        	System.out.println(x[i]);
		        	
		        }
				binary ob = new binary(); 
				binary op= new binary();
		        int n = x.length; 
		        int z =rand.nextInt(1000); 
		        int count=0;
		        String result = ob.binarySearch(x, 0, n - 1, z,count);
		       
		      //  int result1 = op.binarySearchRecursive(x, z, 0, n - 1);
		        
		        if (result == "-1") 
		            System.out.println("Element not present "+count); 
		        else
		            System.out.println("optimized key "+z+" was found at index " + result+": ");
		       
		        int count1=0;
		        String result2 = op.BinarySearch(x, 0, n-1, z,count1);
		        if (result2 == "-1") 
		            System.out.println("Element not present"+count1); 
		        else
		            System.out.println(" key "+z+" was found at index " + result2+": ");
		        
		        int count2=0;
		        String result3 = op.binarySearchRecursive(x, z,0, n-1,count2);
		        if (result3 == "-1") 
		            System.out.println("recursive Element not present "+count2); 
		        else
		            System.out.println("recursive key "+z+" was found at index " + result3+": ");
	}

}
