package prob3.ducks;


public interface Duck 
{
    
    public void display();
    
    default public void fly() {
        System.out.println("Sorry buddy. I cannot fly: (");
    }
    
    default public void swim() {
        System.out.println("Hey guys I am swimming!");
    }
    
    default public void quack() {
        System.out.println("Sorry buddy. I cannot quack :(");
    }
    
    default public void fullDisplay() {
        String className = this.getClass().getSimpleName();
        System.out.println("**************************");
        System.out.println(String.format("%s:", className));
        display();
        fly();
        quack();
        swim();
        System.out.println();
        System.out.println();
    }

}
