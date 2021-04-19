package queue;

public class Main {
	public static void main(String[] args) throws Exception {
		DynamicQueue q=new DynamicQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		System.out.println(q.dequeue());
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		
	}
}
