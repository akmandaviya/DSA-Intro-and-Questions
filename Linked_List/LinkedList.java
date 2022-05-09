package Linked_List;

class Node{
	public int data;
	public Node next;
		
	public Node ( int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

public class LinkedList{
        private Node head;
        private Node tail;
        int size;
       
      
        //get size t.c : o(1)
        public int getSize() { 
        	return this.size;
        }
        
        
        //add first t.c O(1)
        public void addFirst(int data) { 
        	Node n = new Node(data, null);
        	if(this.size == 0) { 
        		this.tail = n;
        		}
        	n.next = this.head;// new node point to old head
        	this.head = n;//transfer head
        	this.size++;
        }
        
        
        //add last with tail  t.c O(1)
        public void addLast(int data) { 
        if(this.size == 0) {  
        	addFirst(data);
        	return;
        }
        Node  n = new  Node(data, null);
        this.tail.next = n;//old tail point to new node
        this.tail = n;//tail transfer
        this.size++;
        }
        
         
        public void addLast(Node n) { 
        	if(this.isEmpty())  {
        		this.head = n;
        		this.tail = n;
        		this.size++;
        	} 
        	else { 
        		    this.tail.next = n;
        	        this.tail = n;
        	        this.size++;
        	}
        }
         
        
        //get the index t.c O(n)
        private Node  getNode(int index) { 
        	if(index >= this.size) return null; //if index passed is more than size
        	if(index == this.size -1) return this.tail;// if we have tail.
        	int currIndex = 0;
        	Node temp = this.head;
        	while (currIndex < index) { 
        		temp = temp.next;
        		currIndex++;
        	}
        	return temp;  	
        }
        
        
        //add in between t.c O(n)
        public void add ( int data, int index)  { 
        	if(index == 0) { //if add in first coz O(1)
        		addFirst(data);
        		return;
        	}
        	if(index == this.size-1) { //if add in last coz O(1)
        		addLast(data);
        		return;
        	}
        	Node  prev = getNode(index-1);// prev node
        	Node n = new Node(data,null);// new node
        	n.next = prev.next;// new node pointing to ref of prev
        	prev.next = n;//change prev
        	this.size++;
        	
        }
        
        
         //T.c O(n)
        public int get(int index) { //return the data of the index
        	//return getNode(index).data;  //this or under lines of code
        	Node n = getNode(index);
        	return n.data;
        }
        
        
      //T.c O(n)
        public void set(int data, int index) { 
           Node n = getNode(index);
           n.data = data;
        }
        
        
        
     // Time Complexity: O(1)
        public void removeFirst()  { 
        	if (isEmpty()) return; //list empty
        	if(this.size==1) this.tail=null; //head and tail point at same element as head becomes null and size becomes 0
        	this.head = this.head.next; //move head to next
        	this.size--;
        }
        
        
//        public Node removeFirst() {
//    		if(isEmpty()) return null;
//    		if(this.size == 1) this.tail = null;
//    		Node nodeToBeRemoved = this.head;
//    		this.head = this.head.next;
//    		this.size--;
//    		return nodeToBeRemoved;
//    	}
        
        
      //T.c O(n)
        public void  remove(int index) { 
        	if(index == 0) {//if we want to remove first node
        		removeFirst();
        		return;
        	} 
        	Node n = getNode(index-1);
        	n.next = n.next.next;// point next to next
        	if(index == this.size - 1) this.tail = n;//for tail
          	this.size--;
        }
        
        

//        public Node remove(int index) {
//    		if(index == 0) {
//    			return removeFirst();
//    			
//    		}
//    		Node n = getNode(idx - 1);
//    		Node nodeToBeRemoved = n.next;
//    		n.next = n.next.next;
//    		if(idx == this.size - 1) this.tail = n;
//    		this.size--;
//    		return nodeToBeRemoved;
//    	}
        
        
        //get mid  t.c O(n)
     public int getMid() { 
        	Node slow = this.head, fast = this.head.next;
        	
        	while(fast !=null && fast.next != null) { 
        		slow = slow.next;
        		fast = fast.next.next;
        	}
        return slow.data;
        }
     
     
        
        //empty check  t.c O(1)
        public boolean isEmpty() { 
        	return this.size==0;
        }
        
        private void swap(Node a, Node b) { 
        	int temp = a.data;
        	a.data = b.data;
        	b.data = temp;
        }
        
        private void swapHeadTail () {
		 Node temp = this.head;
		 this.head = this.tail;
		 this.tail = temp;
		}
        
        //t.c 0(n*n)
        public void reverseDI () { 
        	int l = 0, r = this.size-1;
        	Node lNode, rNode;
        	
        	while(l<r)  {
        		lNode = getNode(l);
        		rNode = getNode(r);
        		

            	swap(lNode, rNode);
            	l++;
            	r--;
        	}
        	
        }
        
        //t.c 0(n)
        public void reversePI() { 
        	Node p = null,c= this.head, n;
        	
        	while(c!=null) { 
        		n=c.next;
        		c.next = p;
        		p = c;
             	c = n;	
        	}
        	swapHeadTail();
        }
        
      
        
        //display t.c O(n)
        public void display()  {
        	Node temp = this.head; //temp var at head
        	while (temp != null) { 
        		System.out.print(temp.data + "->");
        		temp = temp.next; // move forward in  loop 
        	}
        	System.out.println("null");
        }
        
   
      
 }
