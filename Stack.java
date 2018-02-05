package dataStructures;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
	private Node first; // ջ��(�����ӵ�Ԫ��)
	private int N; // Ԫ������

	private class Node {
		// �����˽���Ƕ����
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null; // ��N==0
	}

	public int size() {
		return N;
	}

	public void push(Item item) {
		// ��ջ�����Ԫ��
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public Item pop() {
		// ��ջ��ɾ��Ԫ��
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
