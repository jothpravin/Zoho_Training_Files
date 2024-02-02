import java.util.ArrayList;

class BinaryTreeNode 
{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data) 
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree 
{
    private BinaryTreeNode root;

    public BinaryTree() 
    {
        root = null;
    }

    // Insert a node into the binary tree
    public void insert(int data) 
    {
        root = insertRec(root, data);
    }

    private BinaryTreeNode insertRec(BinaryTreeNode root, int data) 
    {
        if(root == null) 
        {
            root = new BinaryTreeNode(data);
            return root;
        }

        if(data < root.data) 
        {
            root.left = insertRec(root.left, data);
        } 
        else if(data > root.data) 
        {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Search for a node with a given value
    public boolean search(int data) 
    {
        return searchRec(root, data);
    }

    private boolean searchRec(BinaryTreeNode root, int data) 
    {
        if(root == null) 
        {
            return false;
        }

        if(root.data == data) 
        {
            return true;
        }

        if(data < root.data) 
        {
            return searchRec(root.left, data);
        } 
        else 
        {
            return searchRec(root.right, data);
        }
    }

    // Delete a node with a given value
    public void delete(int data) 
    {
        root = deleteRec(root, data);
    }

    private BinaryTreeNode deleteRec(BinaryTreeNode root, int data) 
    {
        if(root == null) 
        {
            return root;
        }

        if (data < root.data) 
        {
            root.left = deleteRec(root.left, data);
        } 
        else if (data > root.data) 
        {
            root.right = deleteRec(root.right, data);
        } 
        else 
        {
            if(root.left == null) 
            {
                return root.right;
            } 
            else if (root.right == null) 
            {
                return root.left;
            }

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(BinaryTreeNode root) 
    {
        int minValue = root.data;
        while(root.left != null) 
        {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    
	public static boolean isEqual(BinaryTreeNode bt1, BinaryTreeNode bt2)
	{
		if(bt1==null && bt2==null) return true;
		
		if(bt1==null || bt2==null) return false;
		
		if(bt1.data != bt2.data) return false;
		
		return isEqual(bt1.left, bt2.left) && isEqual(bt1.right, bt2.right);
	}

	public static void main(String[] args) 
	{
		BinaryTree binaryTree = new BinaryTree();

		binaryTree.insert(50);
		binaryTree.insert(30);
		binaryTree.insert(20);
		binaryTree.insert(40);
		binaryTree.insert(70);
		binaryTree.insert(60);
		binaryTree.insert(80);

		BinaryTree binaryTree1 = new BinaryTree();

		binaryTree1.insert(50);
		binaryTree1.insert(30);
		binaryTree1.insert(20);
		binaryTree1.insert(40);
		binaryTree1.insert(70);
		binaryTree1.insert(60);
		binaryTree1.insert(80);
		
		System.out.println(isEqual(binaryTree.root, binaryTree1.root));
		
		//System.out.println("Search 20: " + binaryTree.search(20)); // true
		//System.out.println("Search 90: " + binaryTree.search(90)); // false

		//binaryTree.delete(20);
		//System.out.println("Search 20 after deletion: " + binaryTree.search(20)); // false
	}
}

