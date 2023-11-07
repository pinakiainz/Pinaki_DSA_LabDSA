package DriverApp;
import com.balancedbrackets.BalancedBracketsChecker;
import com.binarysearchtree.Node;
import com.binarysearchtree.PairInBinarySearchTree;

public class Main {
    public static void main(String[] args) {
       
        String expression1 = "( [ ] { } )";
        String bracketsResult1 = BalancedBracketsChecker.isBalanced(expression1);
        System.out.println("Expression 1: " + bracketsResult1);

        String expression2 = "([)";
        String bracketsResult2 = BalancedBracketsChecker.isBalanced(expression2);
        System.out.println("Expression 2: " + bracketsResult2);

        String expression3 = "{ [ ( ) ] }";
        String bracketsResult3 = BalancedBracketsChecker.isBalanced(expression3);
        System.out.println("Expression 3: " + bracketsResult3);

        String expression4 = "{ [ ) ] }";
        String bracketsResult4 = BalancedBracketsChecker.isBalanced(expression4);
        System.out.println("Expression 4: " + bracketsResult4);

        PairInBinarySearchTree tree = new PairInBinarySearchTree();
        int sum = 130;
     
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        if (tree.isPairPresent(tree.root, sum)) {
            System.out.println("Pair found in the BST.");
        } else {
            System.out.println("Pair not found in the BST.");
        
    }
}
}