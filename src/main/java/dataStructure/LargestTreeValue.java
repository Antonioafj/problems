package dataStructure;


import java.util.ArrayList;
import java.util.List;

public class LargestTreeValue {

    public static List<Integer> largestValue(Tree tree) {
        var list = new ArrayList<Integer>();
        solveTree(tree.root, 0, list);

        return list;
    }

    private static void solveTree(final Tree.Node node,
                                  final int level,
                                  final ArrayList<Integer> list){
        if (node == null) return;

        if (level == list.size()){
            list.add(node.value);
        }else {
            list.set(level, Math.max(list.get(level), node.value));
        }

        solveTree(node.left, level+1, list);
        solveTree(node.right, level+1, list);

    }

}
