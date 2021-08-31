package linked_list;

import java.util.LinkedList;

public class MyGenericStack<T> {
	private LinkedList<T> list;
	public MyGenericStack() {
		list=new LinkedList<>();
	}
	public void add(T t)
	{
		list.addFirst(t);
	}
	public T get()
	{
		return list.removeFirst();
	}
	public void display()
	{
		list.forEach(t -> System.out.print(t+" "));
		System.out.println();
	}
	public static void main(String[] args) {
		MyGenericStack<Integer> l1=new MyGenericStack<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.display();
		System.out.println(l1.get());
		System.out.println(l1.get());
		System.out.println(l1.get());
	//	System.out.println(l1.get());
	}

}
