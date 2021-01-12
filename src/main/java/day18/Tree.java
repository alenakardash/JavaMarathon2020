package day18;

public class Tree {

    Node root = new Node(20);

    public Node insertNode(Node node, int nodeValue) {
        if (node == null) {
            return new Node(nodeValue);
        } else if (nodeValue >= node.getNodeValue()) {
            node.setRightSon(insertNode(node.getRightSon(), nodeValue));
        } else {
            node.setLeftSon(insertNode(node.getLeftSon(), nodeValue));
        }
        return node;
    }

    public void dfs(Node node) {
        if (node != null) {
            dfs(node.getLeftSon());
            System.out.print(node.getNodeValue() + " ");
            dfs(node.getRightSon());
        }
    }
}
