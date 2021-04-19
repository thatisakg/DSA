package linkedlist;

public class LinkedList {
private Node head;
private int size;
private Node tail;
public void addFirst(int data)
{
	Node temp= new Node(data);
	addFirst(temp);
}
public void addFirst(Node node)
{
	if(head==null)
	{
		head=node;
		tail=node;
	}else {
		node.setNext(head);
		head=node;
	}
	this.size++;
}
public void addLast(int data)
{
	Node temp=new Node(data);
	addLast(temp);
}
public void addLast(Node node)
{
	if(head==null)
	{
		head=node;
		tail=node;
	}else {
		tail.setNext(node);
		tail=node;
	}
	this.size++;
}
public void addAtPos(int data, int pos) throws Exception {
	addAtPos(new Node(data), pos);
}

public void addAtPos(Node node, int pos) throws Exception {
	if (pos < 0 || pos > size)
		throw new Exception("position cannot be less than 0 and greater that size");
	if (pos == 0) {
		addFirst(node);
	} else if (pos == size) {
		addLast(node);
	} else {
		int count = 0;
		Node current = head;
		while (count < pos - 1) {
			current = current.getNext();
			count++;
		}
		node.setNext(current.getNext());
		current.setNext(node);
		size++;
	}
}

public Node removeFirst() throws Exception
{
	Node removedNode=head;
	if(size==0)
	{
		throw new Exception("there is no data");
	}
	if(size==1)
	{
		head=null;
		tail=null;
	}else {
		Node temp=head.getNext();
		head.setNext(null);
		head=temp;
	}
	size--;
	return removedNode;
}

public Node removeLast() throws Exception {
	Node removedNode = tail;
	if (size == 0) {
		throw new Exception("there is no data");
	}

	if (size == 1) {
		head = null;
		tail = null;
	}
	Node current = head;
	int count = 0;
	while (count < size - 2) {
		current = current.getNext();
		count++;
	}
	tail = current;
	current.setNext(current.getNext().getNext());
	this.size--;
	return removedNode;
}
 
public Node removeAtPos(int pos) throws Exception {
	if (pos < 0 || pos > size - 1) {
		throw new Exception("position cannot be less than 0 and greater that size");
	} else if (pos == 0) {
		removeFirst();
	} else if (pos == size - 1) {
		removeLast();
	} else {
		Node current = head;
		int count = 0;
		while (count < pos - 1) {
			current = current.getNext();
			count++;
		}
		Node temp = current.getNext().getNext();
		current.getNext().setNext(null);
		current.setNext(temp);
		size--;
	}
	return head;
}

public Node findMidWithSize() throws Exception {
	if (size == 0) {
		throw new Exception("there is no data");
	}
	int count = 0;
	Node current = head;
	int n = 0;
	if (size % 2 == 0) {
		n = (size / 2) - 1;
	} else {
		n = (size / 2);
	}
	while (count < n) {
		current = current.getNext();
		count++;
	}
	return current;
}

public Node findMidWithoutSize() throws Exception {
	if (size == 0) {
		throw new Exception("there is no data");
	}
	Node rabbit = head;
	Node tortoise = head;
	while (rabbit.getNext() != null && rabbit.getNext().getNext() != null) {
		rabbit = rabbit.getNext().getNext();
		tortoise = tortoise.getNext();
	}
	return tortoise;
}
public int getFirst()
{
	if(this.size==0)
	{
		return -1;
	}else {
		return this.head.getData();		
	}
}
public int getLast() {

	if(this.size==0)
	{
		return -1;
	}else {
		return this.tail.getData();
	}
}
public int getAtIndex(int idx)
{
	if(idx>this.size||idx<0)
	{
		return -1;
	}else {
		Node temp=this.head;
		int count=0;
		while(count<idx)
		{
			temp=temp.getNext();
			count++;
		}
		return temp.getData();
	}
}

public Node getNodeAt(int idx)
{
	if(idx>this.size||idx<0)
	{
		return null;
	}else {
		Node temp=this.head;
		int count=0;
		while(count<idx)
		{
			temp=temp.getNext();
			count++;
		}
		return temp;
	}
}

public void display()
{
	Node current=head;
	while(current!=null)
	{
		System.out.print(current.getData()+"->");
		current=current.getNext();
	}
	System.out.println();
}

public void reverseDI() throws Exception
{
	int l=0;
	int r=this.size-1;
	while(l<r)
	{
	    Node lnode= getNodeAt(l);
	    Node rnode=getNodeAt(r);
	    
	    //swap
	    int temp=lnode.getData();
	    lnode.setData(rnode.getData());;
	    rnode.setData(temp);
	    l++;
	    r--;
	}
}

public void reversePI()
{
	Node current=this.head;
	Node prev=null;
    while(current!=null)
    {
    	Node temp=current.getNext();
    	current.setNext(prev);
    	prev=current;
    	current=temp;
    }
    Node temp=this.head;
    this.head=tail;
    this.tail=temp;
}

private Node leftHelper;

public boolean isPalindrome() {
	leftHelper = this.head;
	return isPalindrome(this.head);
}
private boolean isPalindrome(Node right) {
	if (right == null) {
		return true;
	}
	Boolean bl = isPalindrome(right.getNext());
	if (bl == false) {
		return false;
	}
	if (leftHelper.getData() != right.getData()) {
		return false;
	}

	leftHelper = leftHelper.getNext();
	return true;
}
public void fold()
{
	leftHelper=this.head;
	fold(this.head,0);
}
private void fold(Node right,int floor)
{
	if(right==null)
	{
		return;
	}
	fold(right.getNext(),floor+1);
	if(floor>size/2)
	{
		Node currLeftNext=leftHelper.getNext();
		leftHelper.setNext(right);
		right.setNext(currLeftNext);
		leftHelper=currLeftNext;
	}
	if(floor==size/2)
	{
		right.setNext(null);
		tail=right;
	}
}

public void reverseDR() {
	leftHelper=this.head;
	reverseDR(this.head,0);
}
private void reverseDR(Node right,int floor)
{
	if(right==null)
	{
		return;
	}
	reverseDR(right.getNext(),floor+1);
	int temp=leftHelper.getData();
	leftHelper.setData(right.getData());
	right.setData(temp);
	leftHelper=leftHelper.getNext();
	}
}
