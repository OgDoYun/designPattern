public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

//        Beverage.Size strin = Beverage.Size.GRANDE;
        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);

        beverage3 = new Whip(beverage3);
        System.out.println("나는 싱글톤");
    }
}

