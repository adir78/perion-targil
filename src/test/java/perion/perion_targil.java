package perion;

import java.util.Arrays;

import org.junit.Test;

class perion_targil {


	@Test
		public void t1() {
		   int arr1[]={5,1,4,3,6,7,2};
		   int arr2[]={1,2,3,4,5,6,7};
		   
		   int arr3[]={1,2,3};
		   int arr4[]={1,3,4};
		    
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    
		    Arrays.sort(arr3);
		    Arrays.sort(arr4);
		   
		    boolean returnVal1 = Arrays.equals(arr1,arr2);
		    System.out.println("Array 1 and 2 : " + returnVal1);
		    boolean returnVal2 = Arrays.equals(arr3,arr4);
		    System.out.println("Array 3 and 4  : " + returnVal1);

		  
		  
		


}}
