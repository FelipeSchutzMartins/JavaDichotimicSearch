package com.app;

public class Node {
    private String value;
    private Node right;
    private Node left;

    public Node() {}
    public Node(String value) {
        this.value = value;
    }

    public Node getRight() {
        return this.right;
    }

    public Node getLeft() {
        return this.left;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
