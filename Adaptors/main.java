package Adaptors;

public class main {
	public static void main(String[] args) {
		//QueueUsingStackAddEfficient q = new QueueUsingStackAddEfficient();
		QueueUsingStackRemoveEfficient q = new QueueUsingStackRemoveEfficient();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.main);
		q.remove();
       System.out.println(q.main);
       System.out.println(q.peek());
       System.out.println(q.size());
       System.out.println("******************");
       
     //  StackUsingQueuePushEfficient st = new StackUsingQueuePushEfficient();
       StackUsingQueuePopEfficient st = new StackUsingQueuePopEfficient();
       
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       System.out.println(st.main);
      st.pop();
       System.out.println(st.main);
      System.out.println(st.peek());
      System.out.println(st.size());
       }
}
