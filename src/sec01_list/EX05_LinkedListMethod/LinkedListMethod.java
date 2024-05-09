package sec01_list.EX05_LinkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
	public static void main(String[] args) {
		List<Integer> linkedList1 = new LinkedList<>();
		linkedList1.add(3);
		linkedList1.add(4);
		linkedList1.add(5);
		System.out.println(linkedList1.toString());
		
		linkedList1.add(1, 6);
		System.out.println(linkedList1.toString());
		
		List<Integer> LinkedList2 = new LinkedList<>();
		LinkedList2.add(1);
		LinkedList2.add(2);
		LinkedList2.addAll(linkedList1);
		System.out.println(LinkedList2);
		
		List<Integer> linkedList3 = new LinkedList<>();
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.addAll(1, linkedList3);
		System.out.println(linkedList3);
		
		linkedList3.remove(1);
		System.out.println(linkedList3);
		
		linkedList3.remove(new Integer(2));
		System.out.println(linkedList3);
		
		linkedList3.clear();
		System.out.println(linkedList3);
		
		System.out.println(linkedList3.isEmpty());
		
		System.out.println(linkedList3.size());
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.add(3);
		System.out.println(linkedList3);
		System.out.println(linkedList3.size());
		
		System.out.println("0번째: " + linkedList3.get(0));
		System.out.println("1번째: " + linkedList3.get(1));
		System.out.println("2번째: " + linkedList3.get(2));
		for (int i = 0; i < linkedList3.size(); i++) {
			System.out.println(i + "번째 " + linkedList3.get(i));
		}
		
		Object[] object = linkedList3.toArray();
		System.out.println(Arrays.toString(object));
		
		Integer[] integer1 = linkedList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));

		Integer[] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
	}
}
