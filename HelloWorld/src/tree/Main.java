package tree;

public class Main {

	public static void main(String[] args) {
		Tree tree=new Tree();
//		tree.root=new Node(1);
//		tree.root.left=new Node(2);
//		tree.root.right=new Node(3);
//		tree.root.left.left=new Node(4);
//		tree.root.left.left.left=new Node(5);
//		Tree.preOrder(tree.root);
//		System.out.println();
//		Tree.InOrder(tree.root);
//		System.out.println();
//		Tree.PostOrder(tree.root);		
//		System.out.println(Tree.findHeight(tree.root));

//		System.out.println(Tree.findLeft(tree.root,4));
		
		Node root = new Node(50);
	    Tree.add(new Node(25), 50, root, 'L');
        Tree.add(new Node(75), 50, root, 'R');
        Tree.add(new Node(12), 25, root, 'L');
        Tree.add(new Node(37), 25, root, 'R');
        Tree.add(new Node(30), 37, root, 'L');
        Tree.add(new Node(40), 37, root, 'R');
        Tree.add(new Node(62), 75, root, 'L');
        Tree.add(new Node(87), 75, root, 'R');
        Tree.add(new Node(60), 62, root, 'L');
        Tree.add(new Node(70), 62, root, 'R');
//	    Tree.InOrder(root);
//	    Tree.levelOrderTraversal(root);
//      Tree.display(root);
//	    System.out.println(Tree.findGreatest(root));
//      System.out.println(Tree.findMin(root));
//      System.out.println(Tree.findSize(root));
//      Tree.removeLeafs(null, root);
//      System.out.println("------------");
//      Tree.display(root);
//      Tree.printSingleChild(root, null);
//      Tree.printKPath(root,100,200,0," ");
//      System.out.println(Tree.NodeToRoot(root, 40));
//      Tree.printKDown(root, 2);
//      Tree.kdwn(root, 2);
//      Tree.leftView(root,1);
//      Tree.rightView(root,1);
	    System.out.println(Tree.LowestCommonAncestor(root, 60,87));
	}

}
