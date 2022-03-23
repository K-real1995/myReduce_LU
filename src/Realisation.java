import java.util.LinkedList;

public class Realisation {
    public static int reduce(Integer[] param, Solver f){
        LinkedList<Integer> driver = new LinkedList<>();
        driver.add(param[0]);
        for (int i = 1; i < param.length; i++){
            int func = f.solve(driver.getLast(), param[i]);
            driver.add(func);
            driver.remove(0);

        }
        return driver.getLast();
    }
}
