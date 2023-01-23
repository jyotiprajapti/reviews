package methodLearn;

public class RotateArray {
	public static void main(String[] args) {
		int [] array = {1,4,5,5,7};
		int n = array.length;
		int temp=array[n];
	    for(int i=(n-1);i>0;i--)	{
	    	array[i]=array[i-1];
	    	
	    }
	    array[0]=temp;
	    for(int i=0;i<n;i++) {
	    	System.out.print(array[i]);
	    }
	}
	

}
