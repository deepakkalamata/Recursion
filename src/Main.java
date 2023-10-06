public class Main {
    public static void main(String[] args) {
       int num = 5;
       fun(num);
    }

    public static void fun(int num) {
        if (num == 0){
            return;
        }
        fun(num -1);
        System.out.println(num);
    }
}