package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {


        if (first > second) {
            System.out.println(first);
        } else {
            if (second < third) {
                System.out.println(third);
            } else {
                System.out.println(second);
            }
        }
    }
}
