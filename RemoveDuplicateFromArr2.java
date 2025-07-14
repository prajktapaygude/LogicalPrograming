package Array;
// applicable on sorted and unsorted both arrays
import java.util.Arrays;

public class RemoveDuplicateFromArr2 {

	public static void main(String[] args) {

		int[] arr = new int[] {2,4,27,5,5,27,7,12,9,10,0};

		arr = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(arr));
		
	}
}