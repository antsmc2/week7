package prob3.ducks;


public interface NormalDuck extends Duck
{
    @Override
    default public void fly() {
        System.out.println("flying with wings");
    }
    
    @Override
    default public void quack() {
        System.out.println("Quack Quack");
    }

}
