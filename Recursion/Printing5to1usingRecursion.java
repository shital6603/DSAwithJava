public class Printing5to1usingRecursion {
    void printNumbers(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printNumbers(num - 1);
    }

    public static void main(String args[]) {
        Printing5to1usingRecursion p1 = new Printing5to1usingRecursion();
        int n = 5;
        p1.printNumbers(n);
    }
}
