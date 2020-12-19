package com.example.mad_assignment11;

public class TreeNode {
    Integer data;
    TreeNode parent;
    TreeNode child1;
    TreeNode child2;
    public TreeNode(Integer data){
        this.data=data;
    }
    public TreeNode(Integer data, TreeNode parent){
        this.data=data;
        this.parent=parent;
    }
    public TreeNode(Integer data,TreeNode parent ,TreeNode child1, TreeNode child2){
        this.data=data;
        this.parent=parent;
        this.child1=child1;
        this.child2=child2;
    }
    public TreeNode(Integer data ,TreeNode child1, TreeNode child2){
        this.data=data;
        this.child1=child1;
        this.child2=child2;
    }
    public Integer getData() {
        return data;
    }

}

