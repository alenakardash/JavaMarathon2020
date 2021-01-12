package day18;

public class Task3 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insertNode(tree.root, 60);
        tree.insertNode(tree.root, 21);
        tree.insertNode(tree.root, 7);
        tree.insertNode(tree.root, 50);
        tree.insertNode(tree.root, 1);

        tree.dfs(tree.root);


    }
}