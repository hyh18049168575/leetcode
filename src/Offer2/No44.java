package Offer2;

import leetcodeNumbers.No104and98and101and102and108.TreeNode;

import java.util.*;

public class No44 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int count = queue.size(), largest = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            count--;
            largest = Math.max(largest, node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (count == 0) {
                // 当前层已经遍历完毕，将最大值保存到结果中，更新count为新一层的节点数
                count = queue.size();
                result.add(largest);
                largest = Integer.MIN_VALUE;
            }
        }
        return result;
    }
}
