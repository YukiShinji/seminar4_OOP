package family_tree.Family_Tree;

import java.util.*;

public class Family_TreeIterator<T extends Node<T>>  implements Iterator<T>{
    private List<T> list;
    private int index;

    public Family_TreeIterator(List<T> list){
        this.list = list;
        index =0;
    }

     @Override
     public boolean hasNext(){
        return index < list.size();
    }

     @Override
     public T next(){
        return list.get(index++);
     }
}
