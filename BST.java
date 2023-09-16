import java.util.ArrayList;

public class BST implements En {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left substree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);

    }

    public static boolean search(Node root, int key) {

        if (root.data == null) {
            return false;
        } else if (root.data > key) {
            search(root.left, key);

        } else if (root.data == key) {
            return true;
        } else {
            search(root.right, key);

        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);

        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;

            }
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);

        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.right;
        }
        return root;
    }

    public static void printrange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printrange(root.left, x, y);
            System.out.print(root.data + " ");
            printrange(root.right, x, y);
        } else if (root.data >= y) {
            printrange(root.left, x, y);
        } else {
            printrange(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i <= path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14, 9 };
        Node root = null;
        for (int i = 0; i <= arr.length; i++) {
            root = insert(root.right, arr[i]);
        }
        inorder(root);
        System.out.println();
        if (search(root, 7)) {
            System.out.println(" found");
        } else {
            System.out.println("not found");
        }
        printRoot2Leaf(root, new ArrayList<>());
    }

}
