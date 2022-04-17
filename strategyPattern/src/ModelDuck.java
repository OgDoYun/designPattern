public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoway();
        this.quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("저는 모형오리입니다.");
    }
}
