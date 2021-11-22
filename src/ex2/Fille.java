package ex2;

import ex1.ConcreteStackArray;

public class Fille extends Mere {

    private final ConcreteStackArray maSuperPile;

    public Fille(int i, ConcreteStackArray maPile, ConcreteStackArray maSuperPile) {
        super(i, maPile);
        this.maSuperPile = new ConcreteStackArray();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
