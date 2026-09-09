public class Fibonacci {
    
    static void fiboLoop() {
        int prev2 = 0, prev1 = 1;
        System.out.println(prev2);
        System.out.println(prev1);
        for (int i = 0; i < 10; i++) {
            int next = prev1 + prev2;
            System.out.println(next);
            prev2 = prev1;
            prev1 = next;
        }
    }

    static void fiboRec(int prev1, int prev2) {
        if (prev1 == 89) return;
        int next = prev1 + prev2;
        System.out.println(next);
        prev2 = prev1;
        prev1 = next;
        fiboRec(prev1, prev2);
    }

    public static void main(String[] args) {

        // using loop
        fiboLoop();

        // using recursion
        System.out.println(0);
        System.out.println(1);
        fiboRec(1, 0);
    }
}
