package ex1;

public class ConcreteStackArray implements AStack, Cloneable {

    private final Object[] theStack;
    private int nbElement = 0;

    public ConcreteStackArray() {
        theStack = new Object[100];
    }

    @Override
    public boolean isEmpty() {
        return nbElement == 0;
    }

    @Override
    public void push(Object o) {
        theStack[nbElement] = o;
        nbElement++;
    }

    @Override
    public Object peek() {
        return isEmpty() ? null : theStack[nbElement-1];
    }

    @Override
    public Object pop() {
        Object topElementOfStack = null;
        if (!isEmpty()) {
            topElementOfStack = theStack[nbElement-1];
            theStack[nbElement] = null;
            nbElement--;
        }
        return topElementOfStack;
    }

    @Override
    public ConcreteStackArray clone() {
        try {
            ConcreteStackArray clone = (ConcreteStackArray) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
