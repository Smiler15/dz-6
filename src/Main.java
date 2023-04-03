public class Main {
    public static void main(String[] args) {
        int a = 34;
        int b = 56;
        int c = 42;
        int d = 48;
        
        int sum1 = a+b;
        int sum2 = c+d;
        
        System.out.println(sum1 > sum2);

        sum1++;
        sum2 = sum2 - 2;

        System.out.println(sum1 > sum2);

        String result = (sum1 % 2 == 0) || (sum2 % 2 == 0) ? "true" : "false";
        System.out.println(result);
    }
}