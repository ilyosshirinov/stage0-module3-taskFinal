package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int x, y, z;
        z = number % 10;
        y = ((number - z) / 10) % 10;
        x = number / 100;
        System.out.println(z * 100 + y * 10 + x);
    }

    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();
        reverter.revert(120);
    }
}
