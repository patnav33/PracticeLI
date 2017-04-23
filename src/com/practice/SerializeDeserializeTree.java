package com.practice;
import java.util.LinkedList;

public class SerializeDeserializeTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode node =  deserialize("1,2,3,#,#,4,#,#,5"); 
		
	}
	
	public static String serialize(TreeNode root){
		
		if(root == null){
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode t = queue.poll();
			if(t != null){
				sb.append(String.valueOf(t.data)+",");
				queue.add(t.left);
				queue.add(t.right);
			}else{
				sb.append("#");
			}
		}
		sb.deleteCharAt(sb.length()- 1);
		System.out.println(sb.toString());
		return sb.toString();
		
	}
	 
	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data){
		
		if( data == null || data.length() == 0){
			return null;
		}
		
		String[] arr = data.split(",");
		TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		int i =1;
		while(!queue.isEmpty()){
			TreeNode t = queue.poll();
			
			if(t == null)
				continue;
			
			if(!arr[i].equals("#")){
				t.left = new TreeNode(Integer.parseInt(arr[i]));
				queue.offer(t.left);
			}else{
				t.left = null;
				queue.offer(null);
			}
			i++;
			
			if(!arr[i].equals("#")){
				t.right = new TreeNode(Integer.parseInt(arr[i]));
				queue.offer(t.right);
			}else{
				t.right = null;
				queue.offer(null);
			}
			i++;
			
		}
		
		return root;
	}


}

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data = data;
	}
	
}
