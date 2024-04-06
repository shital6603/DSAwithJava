public class Printing1ti5usingRecusion {
    void printNumbers(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        Printing1ti5usingRecusion pr=new Printing1ti5usingRecusion();
        int n=1;
        pr.printNumbers(n);
    }
}
