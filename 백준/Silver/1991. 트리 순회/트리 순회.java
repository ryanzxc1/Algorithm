import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    // 트리를 저장할 맵
    static Map<Character, Node> tree = new HashMap<>();

    // 노드 클래스
    static class Node {
        char left;
        char right;

        Node(char left, char right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            tree.put(root, new Node(left, right));
        }

        preorder('A');
        System.out.println();
        inorder('A');
        System.out.println();
        postorder('A');
    }

    //전위 순회 (Preorder Traversal)
    public static void preorder(char root) {
        if (root == '.') {
            return;
        }
        System.out.print(root);
        preorder(tree.get(root).left);
        preorder(tree.get(root).right);
    }

    //중위 순회 (Inorder Traversal)
    public static void inorder(char root) {
        if (root == '.') {
            return;
        }
        inorder(tree.get(root).left);
        System.out.print(root);
        inorder(tree.get(root).right);
    }

    //후위 순회 (Postorder Traversal)
    public static void postorder(char root) {
        if (root == '.') {
            return;
        }
        postorder(tree.get(root).left);
        postorder(tree.get(root).right);
        System.out.print(root);
    }
}