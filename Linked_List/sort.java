package Linked_List;


//class Node{
//	int data;
//	Node next;
//	
//	Node (int data, Node next) {
//		this.data = data;
//		this.next = next;
//	}
//}

public class sort {
	
	private Node head;
	private Node tail;
	private int size;
	
	//using bubble sort
	//t.c = O(n^2)
	// s.c = O(1)
	
	public void addFirst(int data) {
		Node n = new Node(data, null);
		
		if(this.size == 0) {
			this.tail = n;
		}
		n.next = this.head;
		this.head = n;
		this.size++;
	}
	
	public void bubbleSort() {
		//using 2 pointer c and i
	   Node c = this.head, i = null;
	   
	   int temp; // temp variable for swapping
	   
	   
	   if(head == null) {
		   return;
	   }else {
	        while(c != null) {
		   i = c.next;
		   while( i != null) {
			   if(c.data > i.data) {
				   //swap
				   temp = c.data;
				   c.data = i.data;
				   i.data = temp;
			   }
			   i = i.next;
		   }
		   c = c.next;
	    }
	        
	   }
	   
	}
	

	//using merge sort
	//t.c = O(n^2)
	// s.c = O(1)
	
	private static Node getMid(Node head) {
		if(head == null) {
			return head;
		}
		
		Node fast = head,slow =head;
		
		while(slow != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	private Node sortedMerge(Node a, Node b) {
		
		//base case
		if(a == null) {
			return b;
		}
		if(b == null) {
			return a;
		}
		
		Node res;
		
		
		if(a.data < b.data) {
			res = a;
			res.next = sortedMerge(a.next, b);
		}else {
			res = b;
			res.next = sortedMerge(a, b.next);
			}
		return res;
		
		}
	
	private Node mergeSort(Node head) {
		
		//base case
		if( head == null || head.next == null) {
			return head;
		}
		
		Node mid = getMid(head);
		Node midNext = mid.next;
		
		mid.next = null;
		
		//merge sort on left side
		Node left = mergeSort(head);
		
		//merge sort on right side
		Node right = mergeSort(midNext);
		
		
		//merge left and right 
		Node sortLL = sortedMerge(left, right);
		
		
		return sortLL;
	}
	public void display() {
		Node temp = this.head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void printLL(Node headnext) {
		while(headnext != null) {
			System.out.print(headnext.data + "->");
			headnext = headnext.next;
		}
		System.out.println("null");
	}
public static void main(String[] args) {
	
	sort list = new sort();
	
	list.addFirst(4);
	list.addFirst(1);
	list.addFirst(2);
	list.addFirst(7);
	
	list.display();
	
	list.bubbleSort();
	
	list.display();
	
	sort ll = new sort();
	ll.addFirst(8);
	ll.addFirst(2);
	ll.addFirst(4);
	ll.addFirst(7);
	
     ll.printLL(ll.head);	

	ll.head = ll.mergeSort(ll.head);	
      ll.printLL(ll.head);
}
}
