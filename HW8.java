
public class HW8 {
	 public static void main(String[] args) {
	        double[] arr1 = {16.1, 12.3,22.2, 14.4};
	        double[] arr2 = {1.5, 0.3, 7.0, 19.5, 25.1, 46.2};
	         
	        isSorted(arr2);
	        System.out.println(isSorted(arr2));
	        }
	 
	    public static boolean isSorted(double[] arr) {
	        boolean bool=false;
	         
	        for(int i=1;i<=arr.length-1;i++){
	            int first = i-1;
	            int second=i;
	            if(arr[first]<arr[second]){
	                bool = true;
	            }
	                else bool=false;
	                 
	         
	         
	                                         
	    }
	        return bool;
	         
	                }

}
