import java.util.ArrayList;
import java.util.List;

class GeneralTree {

    private class Node {

        int value;
        Node father;
        List<Node> children;

        public Node(int value) {

            this.value = value;
            father = null;
            children = new ArrayList<>();
        }
    }

    Node root;

    public GeneralTree() {

        root = null;
    }

    public void setRoot(Integer e) {

        if (e == null) {
            throw new IllegalArgumentException("Valor deve ser diferente de nulo.");
        }
        if (root == null) {
            Node node = new Node(e);
            root = node;
        } else {
            root.value = e;
        }
    }

    public Node findNode(Node node, int e) {

        if (node == null) {
            return null;
        }

        if (node.value == e) {
            return node;
        }

        for (Node child : node.children) {
            Node aux = findNode(child, e);
            if (aux != null) {
                return aux;
            }
        }
        return null;
    }

    public void add(Integer e, int father) {

        if (e == null) {
            throw new IllegalArgumentException("Valor deve ser diferente de nulo.");
        }

        if (root == null) {
            setRoot(e);
            return;
        }

        Node aux = findNode(root, father);

        if (aux != null) {
            Node node = new Node(e);
            aux.children.add(node);
            node.father = aux;
        } else {
            System.out.println("Pai não encontrado na árvore.");
        }
    }

    public void remove(int node) {

        Node nodeToRemove = findNode(root, node);

        if (root == nodeToRemove) {
            root = null;
            return;
        }

        Node father = nodeToRemove.father;

        father.children.remove(nodeToRemove);

        for (Node child : nodeToRemove.children) {
            child.father = father;
            father.children.add(child);
        }
    }

    public void preOrder(Node node) {

        if(node == null) {
            return;
        }
        
        System.out.print(node.value + " ");

        for (Node child : node.children) {
            preOrder(child);
        }
    }

    public void preOrder() {
        preOrder(root);
    }
}