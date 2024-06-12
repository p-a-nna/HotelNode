package com.neo.model;
import java.util.*;

public class Node<T> {
    private T data;
    private List<Node<T>> children;

    public Node(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void addChild(Node<T> child) {
        children.add(child);
    }

    public void print(String prefix) {
        System.out.println(prefix + data.toString());
        for (Node<T> child : children) {
            child.print(prefix + "  ");
        }
    }
}
