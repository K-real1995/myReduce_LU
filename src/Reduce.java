import java.util.LinkedList;

public class Reduce {
    public static void main(String[] args) {
        Integer[] mass = new Integer[] {5,8,2,4,3};

        Solver func1 = (int x, int y) -> x + y;

        Solver func2 = (int x, int y) -> x * y;

        System.out.println(Realisation.reduce(mass, func1));

        System.out.println(Realisation.reduce(mass,func2));
    }
}
