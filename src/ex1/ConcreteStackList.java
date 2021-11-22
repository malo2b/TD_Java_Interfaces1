package ex1;

import java.util.ArrayList;

public class ConcreteStackList implements AStack {

    private final ArrayList<Object> theStack;

    public ConcreteStackList() {
        theStack = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    @Override
    public void push(Object o) {
        theStack.add(o);
    }

    @Override
    public Object peek() {
        return isEmpty() ? null : theStack.get(theStack.size()-1);
    }

    @Override
    public Object pop() {
        Object topElementOfStack = null;
        if (!isEmpty()) {
            topElementOfStack = theStack.remove(theStack.size()-1);
        }
        return topElementOfStack;
    }
}
