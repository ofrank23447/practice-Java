package practice12_28_17;
import java.util.*;

public class Testing {
	
	public static void main(String[] args) {
	
		int i = 1;
		int j = 2;
		
		Function1 functions = new Function1();
		int resultAdd = 0;
		resultAdd = functions.getAdd(i, j);
		System.out.println("adding two things: " + resultAdd);
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.addFirst(1);
		list1.addFirst(2);
		list1.addFirst(3);
		System.out.println(list1);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.addFirst(4);
		list2.addFirst(5);
		list2.addFirst(6);
		System.out.println(list2);
		
		LinkedList<Integer> merged = new LinkedList<Integer>();
		merged = functions.mergeTwoLists(list1, list2);
		System.out.println("merged list: " + merged);
	}
	
}
