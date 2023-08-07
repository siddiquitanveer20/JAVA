package assignment9_LinkedList;

import java.util.*;

public class Delete_Nodes {
	public static class LinkedList_by_me {
		class Node {
			public Node(int ali) {
				data = ali;
			}

			int data;
			Node next;
		}

		Node head;

		public void print() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		public int size() {
			int cnt = 0;
			Node temp = head;
			while (temp != null) {
				cnt++;
				temp = temp.next;
			}
			return cnt;
		}
		public boolean isEmpty() {
			return head == null;
		}

		public int getFirst() {
			if (isEmpty()) {
				throw new RuntimeException("kya deekh rha hein ??");
			}
			return head.data;
		}

		public int getLast() {
			if (isEmpty()) {
				throw new RuntimeException("kya deekh rha hein ??");
			}
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp.data;
		}

		public int getAt(int idx) {
			if (isEmpty()) {
				throw new RuntimeException("kya deekh rha hein ??");
			}
			if (idx < 0 || idx >= size()) {
				throw new IndexOutOfBoundsException("???");
			}
			Node temp = head;
			for (int cnt = 1; cnt <= idx; cnt++) {
				temp = temp.next;
			}
			return temp.data;
		}

		private Node getAtNode(int idx) {
			if (isEmpty()) {
				throw new RuntimeException("kya deekh rha hein ??");
			}
			if (idx < 0 || idx >= size()) {
				throw new IndexOutOfBoundsException("???");
			}
			Node temp = head;
			for (int cnt = 1; cnt <= idx; cnt++) {
				temp = temp.next;
			}
			return temp;
		}

		public void addLast(int ali) {
			if (isEmpty()) {
				addFirst(ali);
				return;
			}
			Node nn = new Node(ali);
			Node last = getAtNode(size() - 1);
			last.next = nn;
		}

		public void add(int ali) {
			addLast(ali);
		}

		public void addFirst(int ali) {
			Node nn = new Node(ali);
			if (isEmpty()) {
				head = nn;
				return;
			}
			head.next = nn;
			head = nn;
		}

		public void addAt(int ali, int idx) {
			if (idx == 0) {
				addFirst(ali);
			}
			if (idx < 0 || idx > size()) {
				throw new IndexOutOfBoundsException("???");
			}
			Node prev = getAtNode(idx - 1);
			Node after = prev.next;
			Node curr = new Node(ali);
			prev.next = curr;
			curr.next = after;

		}

		public void removeFirst() {
			if (isEmpty()) {
				throw new RuntimeException("kya deekh rha hein ??");
			}
			int ans = head.data;
			head = head.next;
			return;
			//return ans;
		}

		public void removeLast() {

			if (size() <= 1) {
				 removeFirst();
			}
			Node secondLast = getAtNode(size() - 2);
			Node last = secondLast.next;
			int ans = last.data;
			secondLast.next = null;
			return;
			//return ans;
		}

		public void removeAt(int idx) {
			if (idx <= 0) {
				 removeFirst();
				 return;
			}
			if (idx >= size() - 1) {
				 removeLast();
				 return;
			}

			Node prev = getAtNode(idx - 1);
			Node curr = prev.next;
			Node after = curr.next;

			prev.next = after;
			//return curr.data;

		}
		public void Delete_node() {
			Node cur=head.next;
			Node pre=head;
			int idx=0;
			boolean flag=false;
			while(cur!=null) {
		flag=false;
				Node afters=cur.next;
				if(pre.data<cur.data) {
					removeAt(idx);
					flag=true;
					
				}
				if(!flag) {
				idx++;
				}
				pre=cur;
				cur=afters;
			}
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	public static void main(String[] args) {
		LinkedList_by_me ll=new LinkedList_by_me ();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(sc.nextInt());
		}
		ll.Delete_node();
		ll.print();
		
		

	}

}
