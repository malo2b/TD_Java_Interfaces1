package ex1;

public class Main {

    public static void main(String[] args) {
//        ConcreteStackList maPile = new ConcreteStackList();
        ConcreteStackArray maPile = new ConcreteStackArray();
        System.out.println(maPile.isEmpty());
        maPile.push(5);
        maPile.push(8);
        System.out.println(maPile.isEmpty());
        System.out.println(maPile.pop());
        System.out.println(maPile.pop());
        System.out.println(maPile.pop());
    }
}
