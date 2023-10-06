public class SumRecursion {
    public static void main(String[] args) {
        int num = 100;
        fun1(num);
    }

    public static void fun1(int num) {
        if(num == 0) return;
        System.out.print(num + " ");
        fun1(num - 1);
    }
}
