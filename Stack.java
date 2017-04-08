import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
	private Node first;
	private int N;
	
	private class Node{
		Item item;
		Node next;
	}
	
	//Whether the stack is empty
	public boolean isEmpty(){
		return first == null;
	}
	
	//Get the size of the stack
	public int size(){
		return N;
	}
	
	//Push
	public void push(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	} 
	
	//Pop 
	public Item pop(){
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	//Return the iterator of the stack
	@Override
	public Iterator<Item> iterator(){
		return null;
	}
	
	//Iterator
	private class StackIterator implements Iterator<Item>{
		private Node current = first;
		
		public boolean hasNext(){
			return current != null;
		}
		
		public Item next(){
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
	
}
