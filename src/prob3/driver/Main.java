package prob3.driver;

import java.util.Arrays;
import java.util.List;

import prob3.ducks.DecoyDuck;
import prob3.ducks.Duck;
import prob3.ducks.MallardDuck;
import prob3.ducks.RedHeadDuck;
import prob3.ducks.RubberDuck;

public class Main
{
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new DecoyDuck(), new RedHeadDuck(), new RubberDuck());
        ducks.forEach(duck->duck.fullDisplay());
    }
}
