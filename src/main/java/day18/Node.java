package day18;

public class Node {
    private int nodeValue;

    private Node leftSon;
    private Node rightSon;

    public int getNodeValue() {
        return nodeValue;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
    }
}
