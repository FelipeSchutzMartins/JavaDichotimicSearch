package com.app.utils;

import com.app.Node;

public class TreeUtils {
    public static Node buildMorseTree() {
        Node root = new Node();
        root.setLeft(buildLeftSideTree());
        root.setRight(buildRightSideTree());
        return root;
    }

    public static Node buildRightSideTree() {
        Node right = new Node("T");
        right.setRight(new Node("M"));
        right.getRight().setRight(new Node("O"));
        right.getRight().getRight().setRight(new Node("CH"));
        right.getRight().getRight().setLeft(new Node("Ö"));
        right.getRight().setLeft(new Node("G"));
        right.getRight().getLeft().setRight(new Node("Q"));
        right.getRight().getLeft().setLeft(new Node("Z"));

        right.setLeft(new Node("N"));
        right.getLeft().setLeft(new Node("D"));
        right.getLeft().getLeft().setRight(new Node("X"));
        right.getLeft().getLeft().setLeft(new Node("B"));
        right.getLeft().setRight(new Node("K"));
        right.getLeft().getRight().setLeft(new Node("C"));
        right.getLeft().getRight().setRight(new Node("Y"));
        return right;
    }

    public static Node buildLeftSideTree() {
        Node left = new Node("E");
        left.setLeft(new Node("I"));
        left.getLeft().setRight(new Node("U"));
        left.getLeft().getRight().setRight(new Node("Ü"));
        left.getLeft().getRight().setLeft(new Node("F"));
        left.getLeft().setLeft(new Node("S"));
        left.getLeft().getLeft().setRight(new Node("V"));
        left.getLeft().getLeft().setLeft(new Node("H"));

        left.setRight(new Node("A"));
        left.getRight().setRight(new Node("W"));
        left.getRight().getRight().setRight(new Node("J"));
        left.getRight().getRight().setLeft(new Node("P"));
        left.getRight().setLeft(new Node("R"));
        left.getRight().getLeft().setRight(new Node("Ä"));
        left.getRight().getLeft().setLeft(new Node("L"));
        return left;
    }
}
