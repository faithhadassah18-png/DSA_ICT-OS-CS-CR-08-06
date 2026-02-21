package sum;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list = new CircularLinkedList();
		String you = null;
		list.insertAtBeginning(you);
		String me = null;
		list.insertAtEnd(me);
		list.display();
		list.deleteFromBeginning();
		list.display();
		}


	}


