/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


class Solution {
    public List<Integer> postorder(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (root == null)
        {
            return list; 
        }

        postOrder(root, list);
        
        return list;    
    }

    public void postOrder(Node root, ArrayList<Integer> list) 
    {
        for (Node child : root.children) 
        {
            postOrder(child, list);
        }

        list.add(root.val);
    }

}