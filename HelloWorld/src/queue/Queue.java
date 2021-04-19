package queue;

public class Queue {
	int[] data;
	int front;
	int rear;
	int size;
	
	Queue(int cap)
	{
		front=rear=-1;
		this.data=new int[cap];
	}
	public void enqueue(int val) throws Exception
	{
		if(this.size==this.data.length)
		{
			throw new Exception("queue is full");
		}else {
			rear++;
			data[rear]=val;
			if(this.front==-1)
			{
				front++;
			}
			this.size++;
		}
		return;
	}
	public int dequeue() throws Exception
	{
		if(this.size==0) {
			throw new Exception("queue is empty");
		}
		int temp=data[0];
		front++;
		this.front=this.front%this.data.length;
		this.size--;
		return temp;
	}
	
	public int front() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("queue is empty");
		}
		return this.data[this.front];
	}
	
	public int size()
	{
		return this.size();
	}
	public boolean isEmpty()
	{
		if(this.size==0)
		{
			return true;
		}else {
			return false;
		}
	}
	public void display()
	{
		System.out.println("------------");
		for(int i=0;i<size;i++)
		{
			System.out.println(data[(i+front)%this.data.length]+" ");
		}
		System.out.println("------------f");
	}
}

