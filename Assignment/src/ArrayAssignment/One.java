package ArrayAssignment;

public class One {
		public static void main(String[] args) {
			
	      int[] arr= {1,2,3,4,5,7,8,9,10};
	      
	      int num=arr.length+1;
	      
	      int total=num*(num+1)/2;
	      
	      int sum=0;
	      for(int i=0;i<arr.length;i++) {
	    	  
	    	  sum=sum+arr[i];
	      }
		}
}
