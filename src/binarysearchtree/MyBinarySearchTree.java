/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Feb-20
 *  Time: 10:16 AM
 */
package binarysearchtree;

import com.sun.source.tree.Tree;
import node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyBinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data){
        TreeNode node = new TreeNode(data);

        if(root == null){
            root = node;
        }
        else{
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null){
                parent = temp;
                if(node.getData() <= temp.getData()){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
            if(node.getData() <= parent.getData()){
                parent.setLeft(node);
            }
            else {
                parent.setRight(node);
            }
        }
    }
    public boolean search(int data){
        boolean response = false;
        TreeNode temp = root;
        while (temp !=null){
            if(temp.getData() == data) {
                response = true;
                break;
            }
            if(data <= temp.getData()) {
                temp = temp.getLeft();
            }
            else{
                temp = temp.getRight();
            }

        }


        return response;

    }
    public void traversePreOrder(TreeNode node){
        if(node == null) {

        }
         else{
             System.out.print(node.getData() + ",");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    public void traverseInOrder(TreeNode node){
        if(node == null) {
        }
        else{
            traverseInOrder(node.getLeft());
            System.out.print(node.getData() + ",");
            traverseInOrder(node.getRight());
        }

    }

    public void traversePostOrder(TreeNode node){
        if(node == null) {
        }
        else{
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(node.getData() + ",");

        }
    }
    public TreeNode delete(int data){
        TreeNode response = null;
            TreeNode temp = root;
            TreeNode parent = null;
            //searching the node with given data
            while (temp != null && temp.getData() != data ){
                parent = temp;
                if(data < temp.getData()){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
            if(temp != null){
                response = temp;
                if(isLeaf(temp)){

                    // that means given node is leaf node
                    // to delete it, remove its reference from parent
                    if(parent != null) {
                        if (data < parent.getData()) {
                            parent.setLeft(null);
                        } else {
                            parent.setRight(null);
                        }
                    }
                    else{
                        root = null;
                    }
                }


                else if(temp.getLeft() != null && temp.getRight() == null){
                    //response = temp;
                    if(parent != null) {
                        if (data < parent.getData()) {
                            parent.setLeft(temp.getLeft());
                        } else {
                            parent.setRight(temp.getLeft());
                        }
                    }
                    else{
                        root = temp.getLeft();
                    }

                }
                else if(temp.getRight() != null && temp.getLeft() == null){
                    //response = temp;
                    if(parent != null) {
                        if (data < parent.getData()) {
                            parent.setLeft(temp.getRight());
                        } else {
                            parent.setRight(temp.getRight());
                        }
                    }
                    else{
                        root = temp.getRight();
                    }
                }
                else{
                    response = temp;
                    TreeNode successor = getSuccessor(temp);
                    System.out.println("successor is ==>" + successor.getData());
                    successor.setRight(temp.getRight());
                    successor.setLeft(temp.getLeft());
                    if(parent != null) {
                        if (data < parent.getData()) {
                            parent.setLeft(successor);
                        } else {
                            parent.setRight(successor);
                        }
                    }
                    else{
                        root = successor;

                    }
                }

            }


        return response;
    }

    private TreeNode getSuccessor(TreeNode temp) {
        TreeNode response = null;
        temp = temp.getRight();
        while(temp!= null){
            response = temp;
            temp = temp.getLeft();
        }
        response = delete(response.getData());
        return response;
    }

    private boolean isLeaf(TreeNode node){
        return (node.getLeft() == null && node.getRight() == null);
    }

    public void traverseLevelOrder(TreeNode node){
        if(node != null) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                TreeNode current = q.remove();
                System.out.print(current.getData() + ",");
                if (current.getLeft() != null) {
                    q.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    q.add(current.getRight());
                }
            }
        }
        else{
            System.out.println("empty tree");
        }
    }

    public void traversePreOrderWithoutRecursion(TreeNode node){
        if(node != null){
            Stack<TreeNode> s = new Stack<>();
            s.push(node);
            while(!s.empty()){
                TreeNode current = s.pop();
                System.out.print(current.getData() + ",");
                if(current.getRight() != null){
                    s.push(current.getRight());
                }
                if(current.getLeft() != null){
                    s.push(current.getLeft());
                }
            }
        }
        else{
            System.out.println("empty tree");
        }
    }
    public void traverseInOrderWithoutRecursion(TreeNode node){
        if(node != null){
            Stack<TreeNode> s = new Stack<>();
            s.push(null);

            while(s.peek() !=null){
                s.push(node);

            }
        }
        else{
            System.out.println("empty tree");
        }
    }

    public int height(TreeNode node){
        if(node == null){
            return -1;
        }
        else{
            return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        }
    }
    public int heightNonRecursive(TreeNode node){
        if(node == null){
            return -1;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int height = -1;

        while (!q.isEmpty()){
            int size = q.size();
            height++;
            while(size > 0 ){
                TreeNode curr = q.remove();
                if(curr.getLeft() != null){
                    q.add(curr.getLeft());
                }
                if(curr.getRight() != null){
                    q.add(curr.getRight());
                }
                size--;
            }

        }
        return height;
    }


}
