package day25polymorphism;

public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println(" cats move..");
    }

    @Override
    protected int toplama(int a, int b) {
        return super.toplama(a, b);
    }

}
