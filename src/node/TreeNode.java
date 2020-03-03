/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Feb-20
 *  Time: 10:11 AM
 */
package node;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    private int height;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
        height = 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
