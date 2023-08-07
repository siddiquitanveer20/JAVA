package assignment9_LinkedList;

import java.util.Scanner;



public class kth_from_last {

	public static Scanner sc=new Scanner(System.in);
	public static class LinkedList_by_me{

		class node {
			int data;              //DF  0
			node next;             //DF  null
		 public node(int ali){
			 data=ali;	 
		       }
	         }
		    node head;                //DF  null

		public void dispaly() {
			node temp=head;
			while(temp!=null) {       //till linked list end
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
		}
		public int size() {
			node temp=head;
			int size=0;
			while(temp!=null) {    //till linked list end ,,temp  storing null after loop end
				temp=temp.next;
				size++;
			}
			return size;
		}
		public boolean isEmpty() {
			return head==null;
		}
		
		private node getLastNode() {     //private because only this class function use this
			if(isEmpty()) {
				throw new RuntimeException("LinkedList is empty bro!!!!");
			}
			node temp=head;
			while(temp.next!=null) {    //till second last node ,,temp store last node adress after loop end
				temp=temp.next;
				}
			return temp;		
		}
		
		public void add(int ali) {
			addLast(ali);
		}
		public void addLast(int ali) {
			node nn=new node(ali);
			if(isEmpty()) {
				head=nn;
				return;
			}
			node last=getLastNode();
			last.next=nn;	
		}
		public int KthLast() {
			int val=0;
			int limit=1;
			while(limit>0) {
				val=sc.nextInt();
				if(val>0) {
					add(val);
					limit=val;
				}else {
				limit=val;}
			}
			int k=sc.nextInt();
			node aage = head;
			node peeche = head;
			for (int i = 0; i < k; i++) {
				aage = aage.next;
			}
			while (aage != null) {
				aage = aage.next;
				peeche = peeche.next;
			}
			return peeche.data;
		}
		
		
		
		
	}
	public static void main(String[] args) {
		LinkedList_by_me ll=new LinkedList_by_me ();
		
		
		int ans=ll.KthLast();
		System.out.println(ans);

	}

}
