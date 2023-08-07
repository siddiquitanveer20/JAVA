package assignment9_LinkedList;

import java.util.*;

import assignment9_LinkedList.merge_link_list.LinkedList_by_me;
public class Kth_merge_list {
	public static Scanner sc=new Scanner(System.in);
	public static  class node {
		int data;              //DF  0
		node next;             //DF  null
	 public node(int ali){
		 data=ali;	 
	       }
         }
	public static class LinkedList_by_me{
				
		public  node head;           //DF  null

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
		public node rethead() {
			return head;
		}

	}

	public static void main(String[] args) {
		LinkedList_by_me LL1=new LinkedList_by_me();
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		for(int i=0;i<n*k;i++) {
			LL1.add(sc.nextInt());
			
		}
		node temp1=LL1.head;
		node temp2=LL1.head;
		boolean issort=true;
		while(temp1!=null) {
			issort=true;
			temp2=LL1.head;
			while(temp2.next!=null) {
				node cur=temp2;
				node after=temp2.next;
				if(cur.data>after.data) {
					int data=cur.data;
					cur.data=after.data;
					after.data=data;
					issort=false;
				}
				temp2=temp2.next;
				
			}
			if(issort==true) {
				break;
			}
			temp1=temp1.next;
			
		}
		LL1.dispaly();
		
		
		
		
		
		
		

	}

}
