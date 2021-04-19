package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    Node root;
    
    public static void preOrder(Node root) {
    	if(root==null)
    	{
    		return;
    	}
    	System.out.print(root.data+" ");
    	preOrder(root.left);
    	preOrder(root.right);
    }
    public static void InOrder(Node root) {
    	if(root==null)
    	{
    		return;
    	}
        InOrder(root.left);
        System.out.print(root.data+" ");
    	InOrder(root.right);
    }
    public static void PostOrder(Node root) {
    	if(root==null)
    	{
    		return;
    	}
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
      }
    
    public static int findHeight(Node root)
    {
    	if(root==null)
    	{
    		return 0;
    	}
    	int left=findHeight(root.left);
    	int right=findHeight(root.right);
    	return Math.max(left, right)+1;
    }
    
    public static int findLeft(Node root,int number)
    {
    	if(root==null||root.left==null)
    	{
    		return -1;
    	}
    	if(root.data==number)
    	{
    		return root.left.data;
    	}
    	int fromLeft=findLeft(root.left,number);
    	int fromRight=findLeft(root.right,number);
    	
    	return fromLeft!=-1? fromLeft:fromRight;
    }
    
    public static Node find(int number, Node root) {
        if(root == null)
            return null;
        if(root.data == number)
            return root;

        Node fromLeft = find(number,root.left);
        Node fromRight = find(number, root.right);

        return fromLeft != null ? fromLeft : fromRight;
    }

    public static void add(Node newNode, int atWhichToAdd ,Node root, Character position) {

        if(root == null) {
            root = newNode;
            return;
        }
        Node current = find(atWhichToAdd, root);
        if(position == 'L' && current.left == null) {
            current.left = newNode;
            return;
        } else if(position == 'R' && current.right == null) {
            current.right = newNode;
            return;
        }
        throw new RuntimeException("already node present");

    }
    
    public static void levelOrderTraversal(Node root) {

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node curr = queue.poll();
			if (curr == null) {
				System.out.println();
				if (queue.size() != 0)
					queue.add(null);
				continue;
			}
			System.out.print(curr.data + " ");
			if (curr.left != null) {
				queue.add(curr.left);
			}
			if (curr.right != null) {
				queue.add(curr.right);
			}
		}
	}

  public static void display(Node node) {
	if (node == null) {
		return;
	}
	String str = "";
	str += node.left != null ? node.left.data + "->" : ".->";
	str += node.right != null ? node.data + "<-" + node.right.data : node.data + "<-.";
	System.out.println(str);
	display(node.left);
	display(node.right);
}
    
    public static int findGreatest(Node root)
    {
    	if(root==null)
    	{
    		return Integer.MIN_VALUE;
    	}
    	int res=root.data;
    	int lres=findGreatest(root.left);
    	int rres=findGreatest(root.right);
    	if(lres>res)
    	{
    		res=lres;
    	}
    	if(rres>res)
    	{
    		res=rres;
    	}

       return res;
    }
    
    public static int findMin(Node root)
    {
    	if(root==null)
    	{
    		return Integer.MAX_VALUE;
    	}
    	int lres=findMin(root.left);
    	int rres=findMin(root.right);
    	int res=Math.min(lres, rres);

       return Math.min(res, root.data);
    }
    
    
    public static int findSize(Node root)
    {
    	if(root==null)
    	{
    		return 0;
    	}
    	int lsize=findSize(root.left);
    	int rsize=findSize(root.right);
    	
    	return lsize+rsize+1;
    	
    }
    
    public static void removeLeafs(Node parent,Node child)
    {
    	if(child==null)
    	{
    		return;
    	}
    	if(child.left==null&&child.right==null)
    	{
    		if(parent.left==child)
    		{
    			parent.left=null;
    		}else {
    			parent.right=null;
    		}
    		return;
    	}
    	removeLeafs(child,child.left);
    	removeLeafs(child,child.right);
    }
    
    
    public static void printSingleChild(Node child,Node parent)
    {
    	if(child==null)
    	{
    		return;
    	}
    	if(parent!=null&&parent.left==child&&parent.right==null)
    	{
    		System.out.println(child.data);
    	}
    	if(parent!=null&&parent.right==child&&parent.left==null)
    	{
    		System.out.println(child.data);
    	}
    	printSingleChild(child.left,child);
    	printSingleChild(child.right,child);
    }
    
    public static void printKPath(Node node,int lo,int hi,int sum,String str)
    {
    	if(node==null)
    	{
    		return;
    	}
    	if(node.left==null&&node.right==null)
    	{
    		sum+=node.data;
    		str+=node.data;
    		if(sum<hi&&sum>lo)
    		{
    			System.out.println(str);
    		}
    		return;
    	}
    	printKPath(node.left,lo,hi,sum+node.data,str+node.data+" ");
    	printKPath(node.right,lo,hi,sum+node.data,str+node.data+" ");
    }
    
  
    public static ArrayList<Node> NodetoRoot(Node node, int data) {
		if (node == null) {
			ArrayList<Node> br = new ArrayList<Node>();
			return br;
		}

		if (node.data == data) {
			ArrayList<Node> br = new ArrayList<Node>();
			br.add(node);
			return br;
		}
		ArrayList<Node> myres = NodetoRoot(node.left, data);
		if (myres.size() > 0) {
			myres.add(node);
			return myres;
		}

		ArrayList<Node> myres1 = NodetoRoot(node.right, data);
		if (myres1.size() > 0) {
			myres1.add(node);
			return myres1;
		}

		return new ArrayList<Node>();
	}
    public static void printKDown(Node node,int k)
    {
    	if(node==null)
    	{
    		return;
    	}
    	if(k==0)
    	{
    		System.out.println(node.data+" ");
    	}else {
    		printKDown(node.left,k-1);
    		printKDown(node.right,k-1);
    	}
    }
    
    
public static void printKaway(Node node, int data, int k) {
	ArrayList<Node> path = NodetoRoot(node, data);
	printKDown(path.get(0), k);
	for (int i = 1; i < path.size() && i < k; i++) {
		Node n = path.get(i);
		Node nm = path.get(i - 1);

		if (n.left == nm) {
			printKDown(n.right, k - i - 1);
		} else {
			printKDown(n.left, k - i - 1);
		}
	}

	if (path.size() > k) {
		System.out.println(path.get(k).data);
	}
}

public static void kdwn(Node node,int k)
{
	if(node==null)
	{
		return;
	}
	if(k==0)
	{
		System.out.println(node.data);
	}
	
	kdwn(node.left,k-1);
	kdwn(node.right,k-1);
}

static int max_level;

public static void leftView(Node root, int level) {

    if(root == null)
        return;

    if(max_level < level) {
        System.out.println(root.data);
        max_level = level;
    }
    leftView(root.left, level + 1);
    leftView(root.right, level + 1);

}

public static void rightView(Node root, int level) {
//wrong
    if(root == null)
        return;
    if(max_level < level) {
        System.out.println(root.data);
        max_level = level;
    }
    leftView(root.right, level + 1);
    leftView(root.left, level + 1);
   

}

public static void rightViewWithQueue(Node root) {

    Queue<Node> queue = new LinkedList<>();
    queue.add(root); //root = 1
    while (!queue.isEmpty()) {

        int n = queue.size();
        while(n != 0) {
            Node temp = queue.poll();
            if( n==1 ) {
                System.out.println(temp.data); //1
            }
            if(temp.left != null) {
                queue.add(temp.left);
            }
            if(temp.right != null) {
                queue.add(temp.right);
            }
            n--;
        }
    }
}

public static int LowestCommonAncestor(Node root,int n1, int n2) {
	   ArrayList<Node> arrayList1 = NodetoRoot(root, n1);
	   ArrayList<Node> arrayList2 = NodetoRoot(root, n2);

	   int i = arrayList1.size()-1;
	   int j = arrayList2.size()-1;

	   while (arrayList1.get(i) == arrayList2.get(j)) {
	   	   if(arrayList1.get(i).data == n2 || arrayList2.get(j).data == n1) {
	   	   		return arrayList1.get(i+1).data;
		   }
	       i--;
	       j--;
    }
	   return arrayList1.get(i+1).data;
 }

static class Pair {
	Node node;
	int wc = 0;

	public Pair(Node node, int wc) {
		this.node = node;
		this.wc = wc;
	}
}
public static void preIter(Node node) {
	Stack<Pair> stack = new Stack<>();
	Pair pair = new Pair(node, 0);
	stack.push(pair);
	while (stack.size() > 0) {
		Pair tpair = stack.peek();
		if (tpair.wc == 0) {
			System.out.print(tpair.node.data + " ");
			tpair.wc++;
		} else if (tpair.wc == 1) {
			if (tpair.node.left != null) {
				Pair left = new Pair(tpair.node.left, 0);
				stack.push(left);
			}
			tpair.wc++;
		} else if (tpair.wc == 2) {
			if (tpair.node.right != null) {
				Pair right = new Pair(tpair.node.right, 0);
				stack.push(right);
			}
			tpair.wc++;
		} else {
			stack.pop();
		}
	}
	System.out.println();
}

public static void postIter(Node node) {
	Stack<Pair> stack = new Stack<>();
	Pair pair = new Pair(node, 0);
	stack.push(pair);
	while (stack.size() > 0) {
		Pair tpair = stack.peek();
		if (tpair.wc == 0) {
			if (tpair.node.left != null) {
				Pair left = new Pair(tpair.node.left, 0);
				stack.push(left);
			}
			tpair.wc++;
		} else if (tpair.wc == 1) {
			if (tpair.node.right != null) {
				Pair right = new Pair(tpair.node.right, 0);
				stack.push(right);
			}
			tpair.wc++;
		} else if (tpair.wc == 2) {

			System.out.print(tpair.node.data + " ");
			tpair.wc++;
		} else {
			stack.pop();
		}
	}
	System.out.println();
}

public static void inIter(Node node) {
	Stack<Pair> stack = new Stack<>();
	Pair pair = new Pair(node, 0);
	stack.push(pair);
	while (stack.size() > 0) {
		Pair tpair = stack.peek();
		if (tpair.wc == 0) {
			if (tpair.node.left != null) {
				Pair left = new Pair(tpair.node.left, 0);
				stack.push(left);
			}
			tpair.wc++;
		} else if (tpair.wc == 1) {

			System.out.print(tpair.node.data + " ");
			tpair.wc++;

		} else if (tpair.wc == 2) {
			if (tpair.node.right != null) {
				Pair right = new Pair(tpair.node.right, 0);
				stack.push(right);
			}
			tpair.wc++;

		} else {
			stack.pop();
		}
	}
	System.out.println();
}

public static boolean isBalanced(Node node) {
	if (node == null) {
		return true;
	}
	boolean lcheck = isBalanced(node.left);
	if (lcheck == false) {
		return false;
	}
	boolean rcheck = isBalanced(node.right);
	if (rcheck == false) {
		return false;
	}

	int lheight = findHeight(node.left);
	int rheight = findHeight(node.right);
	if (lheight - rheight >= -1 && lheight - rheight <= 1) {
		return true;
	}

	return false;
}

static class Pair1 {
	int height;
	boolean balance;

	Pair1(int h, boolean bal) {
		this.height = h;
		this.balance = bal;
	}
}

public static boolean isBalancedImprove(Node node) {
	return isBalancedImprovehelper(node).balance;
}

private static Pair1 isBalancedImprovehelper(Node node) {
	if (node == null) {
		return new Pair1(0, true);
	}
	Pair1 leftp = isBalancedImprovehelper(node.left);
	Pair1 rightp = isBalancedImprovehelper(node.right);
	if (leftp.balance == false || rightp.balance == false) {
		return new Pair1(Math.max(leftp.height, rightp.height) + 1, false);
	}

	if (leftp.height - rightp.height >= -1 && leftp.height - rightp.height <= 1) {
		return new Pair1(Math.max(leftp.height, rightp.height) + 1, true);
	}

	return new Pair1(Math.max(leftp.height, rightp.height) + 1, false);
}

static class Pair2 {
	int height;
	int maxDiameter;

	Pair2(int h, int d) {
		this.height = h;
		this.maxDiameter = d;
	}
}
public static int diameter(Node node) {
	return diameterHelper(node).maxDiameter;
}

private static Pair2 diameterHelper(Node node) {
	if (node == null) {
		return new Pair2(0, 0);
	}
	Pair2 left = diameterHelper(node.left);
	Pair2 right = diameterHelper(node.right);
	int myDia = left.height + right.height + 1;

	int max = Math.max(myDia, Math.max(left.maxDiameter, right.maxDiameter));

	return new Pair2(Math.max(left.height, right.height) + 1, max);
}


//public static boolean isBstbad(Node node) {
//	if (node == null) {
//		return true;
//	}
//	boolean lans = isBstbad(node.left);
//	boolean rans = isBstbad(node.right);
//	if (lans == false || rans == false) {
//		return false;
//	}
//
//	int lmax = findGreatest(node.left);
//	int rmin = findMin(node.right);
//	if (node.data > lmax && node.data < rmin) {
//		return true;
//	}
//	return false;
//}

private static class pair4 {
	int max;
	int min;
	boolean Isbalanced;
}

public static boolean isBst(Node node) {
	return isBstHelper(node).Isbalanced;
}

private static pair4 isBstHelper(Node node) {
	if (node == null) {
		pair4 p = new pair4();
		p.Isbalanced = true;
		p.max = Integer.MIN_VALUE;
		p.min = Integer.MAX_VALUE;
		return p;
	}

	pair4 lpair = isBstHelper(node.left);
	pair4 rpair = isBstHelper(node.right);

	if (lpair.Isbalanced == false || rpair.Isbalanced == false) {
		pair4 p = new pair4();
		p.Isbalanced = false;
		return p;
	}

	pair4 mpair = new pair4();
	mpair.max = Math.max(lpair.max, Math.max(rpair.max, node.data));
	mpair.min = Math.min(lpair.min, Math.min(rpair.min, node.data));
	if (node.data > lpair.max && node.data < rpair.min) {
		mpair.Isbalanced = true;
	}

	return mpair;
}
}

