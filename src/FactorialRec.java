public class FactorialRec {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factRec(num));
    }
    public static int factRec(int num){
        if(num == 0) return 1;
        return num * factRec(num -1);
    }
}
