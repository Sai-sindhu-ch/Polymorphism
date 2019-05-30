package polymorphism;
interface Fly{
    void goForward();
    void goDown();
}
 class Bird {

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.goForward();
        duck.goDown();
        Finch finch = new Finch();
        finch.goForward();
        finch.goDown();

    }

}