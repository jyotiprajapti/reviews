package methodLearn;
import java.util.Arrays;
public class ArraySort {
	public static void main(String[] args) {
		int []  array = {1,3,-5,-8,27,-8,9,4,-3};
		int n = array.length;
		Arrays.sort(array);
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}

	}
	
}
