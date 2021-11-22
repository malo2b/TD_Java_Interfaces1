package ex2;

public class Mere implements Cloneable {

    private int i;
    private unObjet monObjet; // Cloneable

    public Mere(int i ,unObjet monObjet) {
        this.i = i;
        this.monObjet = monObjet;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mere mere = (Mere)super.clone();
        mere.monObjet = (unObjet)monObjet.clone();
        return mere;
    }
}
