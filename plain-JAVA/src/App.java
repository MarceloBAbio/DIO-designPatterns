import Facade.Facade;
import Singleton.SingletonLazy;
import Strategy.AggresiveBehaviour;
import Strategy.Behaviour;
import Strategy.DefensiveBehaviour;
import Strategy.NormalBehaviour;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "The singleton pattern make sure the class is only created once and is provided everytime the method is called.");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println();

        System.out.println(
                "The strategy pattern enable you to apply to a class different ways to operate a method using polymorphism.");
        Behaviour defense = new DefensiveBehaviour();
        Behaviour normal = new NormalBehaviour();
        Behaviour aggro = new AggresiveBehaviour();
        Robot robot = new Robot();
        robot.setBehaviour(normal);
        robot.move();
        robot.setBehaviour(aggro);
        robot.move();
        robot.setBehaviour(defense);
        robot.move();
        System.out.println();

        System.out.println("Facade design pattern. It uses an object that serves as a front-facing interface masking more complex underlying or structural code.");
        Facade facade = new Facade();
        facade.migrateClient("REDACTED", "1001");

    }
}
