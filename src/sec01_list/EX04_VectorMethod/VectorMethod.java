package sec01_list.EX04_VectorMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod {
	public static void main(String[] args) {
		List<Integer> vector1 = new Vector<>();
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		System.out.println(vector1.toString());
		
		vector1.add(1, 6);
		System.out.println(vector1.toString());
		
		List<Integer> vector2 = new Vector<>();
		vector2.add(1);
		vector2.add(2);
		vector2.addAll(vector1);
		System.out.println(vector2);
		
		List<Integer> vector3 = new Vector<>();
		vector3.add(1);
		vector3.add(2);
		vector3.addAll(1, vector3);
		System.out.println(vector3);
		
		vector3.remove(1);
		System.out.println(vector3);
		
		vector3.remove(new Integer(2));
		System.out.println(vector3);
		
		vector3.clear();
		System.out.println(vector3);
		
		System.out.println(vector3.isEmpty());
		
		System.out.println(vector3.size());
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println("0번째: " + vector3.get(0));
		System.out.println("1번째: " + vector3.get(1));
		System.out.println("2번째: " + vector3.get(2));
		for (int i = 0; i < vector3.size(); i++) {
			System.out.println(i + "번째 " + vector3.get(i));
		}
		
		Object[] object = vector3.toArray();
		System.out.println(Arrays.toString(object));
		
		Integer[] integer1 = vector3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));

		Integer[] integer2 = vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
	}
}
