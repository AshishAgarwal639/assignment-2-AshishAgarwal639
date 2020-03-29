/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;
public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    static int levels = 0;
    public TreeNode root;

    public MyBinarySearchTree() {
        root = null;
        preOrderString = new StringBuilder();
    }

    public void add(final int value) {
        root = addService(root, value);
    }

    public TreeNode addService(final TreeNode treeRoot, final int addingValue) {
        if (treeRoot == null)
            return new TreeNode(addingValue);
        if (addingValue < treeRoot.da)
    }
}
