package com.practice.educative.grokking.binarytree;

import java.util.List;

public interface FindAllTreePaths {

    public abstract List<List<Integer>> findPaths(TreeNode<Integer> root, Integer sum);
}