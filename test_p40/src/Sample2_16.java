import java.lang.reflect.Array;
//108360140
public class Sample2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = (int[])Array.newInstance(int.class, 3);
		Array.set(intArray, 0, 123);
		Array.set(intArray, 1, 456);
		Array.set(intArray, 2, 789);
		
		System.out.println("intArray[0] ="+ Array.get(intArray,0));
		System.out.println("intArray[1] ="+ Array.get(intArray,1));
		System.out.println("intArray[2] ="+ Array.get(intArray,2));
	}

}
