package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        if (number <= 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public static void main(String[] args) {
        NumbersPrinter printer=new NumbersPrinter();
        printer.printIsPositive(0);
    }
}
