package project.java;

public class SinglyLinkedLists {
	
		Node head;
		SinglyLinkedLists(){
			head=null;
			
			}
		 void insertatthebeginning(int data) {
			Node newNode =new Node(data);
			newNode.next=head;
			return;
		 }
		 void insertAtEnd(int data) {
			 Node newNode = new Node(data);
			 if(head== null) {
				 head =newNode;
				 return;
			 }
		 
		 Node temp = head;

				 
		 while(temp.next!=null); {
			 temp=temp.next;
		 }
		 temp.next = newNode;
		 }

		void deletefrombeginning() {
			if(head==null) {
				System.out.println ("list is empty");
			return;
			
		}
		head =head.next;
		}

		 void deletefromEnd() {
			if(head==null){
				System.out.println ("list is empty");
			return;
		}
		if(head.next ==null) {
			head=null;
			return;
		}
			Node temp = head;
			while (temp.next.next !=null) {
				temp =temp.next;
			
			}
			temp.next =null;
		}
		boolean search (int key) {
			Node temp=head;
			while (temp != null) {
				if (temp.data==key) {
					return true;
				}
				temp=temp.next;
			}
			return false;
		}
		void display() {
			Node temp=head;
			while (temp !=null) {
				System.out.print(temp.data +" --> ");
				temp =temp.next;
			}
			System.out.println ("null");
				}
					
				
		 }



