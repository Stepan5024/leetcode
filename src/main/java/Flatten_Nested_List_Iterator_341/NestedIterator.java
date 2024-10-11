package Flatten_Nested_List_Iterator_341;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class NestedIterator implements Iterator<Integer> {

    private List<Integer> flatList;
    private int index;

    public NestedIterator(List<NestedInteger> nestedList) {
        flatList = new ArrayList<>();
        index = 0;
        flattenList(nestedList);
    }

    @Override
    public Integer next() {
        return flatList.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < flatList.size();
    }

    private void flattenList(List<NestedInteger> nestedList) {
        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) {
                flatList.add(ni.getInteger());
            } else {
                flattenList(ni.getList());
            }
        }
    }
}


/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */