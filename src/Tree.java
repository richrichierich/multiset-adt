import java.util.*;
public class Tree {
    Object _root;
    Tree[] _subtrees;

    public Tree(Object root, Tree[] subtrees){
        this._root = root;
        this._subtrees = subtrees;
    }

    public boolean is_empty(){
        return this._root == null;
    }

    public int length(){
        int len = 0;
        for (int i = 0; i < this._subtrees.length; i++){
            len += 1;
        }
        return len;
    }
//Good GOod
}
