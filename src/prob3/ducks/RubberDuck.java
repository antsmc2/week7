package prob3.ducks;


public class RubberDuck implements Duck
{
    @Override
    public void quack() {
        System.out.println("Quack by squeaking");
    }
    
    @Override
    public void display() {
        System.out.println("Displaying RubberDuck");
    }

}
