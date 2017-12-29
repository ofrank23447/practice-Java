package practice12_28_17;

import java.util.LinkedList;
import java.util.Iterator;

class Function1 {

	public int getAdd(int a, int b) {
		return (a + b);
	}
	
	public int getSub(int a, int b) {
		return (a - b);
	}
	
	public void pushThis(LinkedList<Integer> list, int a) {
		list.push(a);
	}
	
	public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		Iterator<Integer> itr = list2.iterator();
		while(itr.hasNext()) {
			list1.addLast(itr.next());
		}
		return list1;
	}
}
