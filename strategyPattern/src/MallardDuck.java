public class MallardDuck extends Duck {
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
