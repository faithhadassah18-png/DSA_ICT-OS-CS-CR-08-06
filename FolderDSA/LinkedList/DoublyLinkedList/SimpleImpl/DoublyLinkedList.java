package sum;

public class DoublyLinkedList {
	Dnode head;
	DoublyLinkedList(){
		this.head = null;
	}
	
	void inserttheBeginning(int data) {
		Dnode newNode = new Dnode(data);
		if(head !=null) {
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	void insertatEnd(int data) {
		Dnode newNode = new Dnode(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Dnode temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	void deleteFromBeginning() {
		if(head == null)return;
		head = head.next;
		if(head !=null) {
			head.prev = null;
		}
		}
	
	void deleteFromEnd() {
		if (head == null)return;
		if(head.next == null) {
			head = null;
			return;
		}
		Dnode temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		temp.prev.next = null;
	}
	
	void displayForward() {
		Dnode temp = head;
		while(temp !=null) {
			System.out.println(temp.data + "<->");
			temp = temp.next;
		}
		System.out.println("null");
		}
	}