import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		float[] prices = new float[10];
		System.out.println(numbers.length);
//		System.out.println(numbers[10]);
		
		numbers[4] = 20;
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
