public class gcd {
    public static void main(String[] args) {
        GCD(232,543);
    }
    private static int GCD(int a, int b) {
        if (a == 0 || b == 0) {
            return -1;
        }
        int biggerNum, smallerNum;
        if (a < b) {
            biggerNum = b;
            smallerNum = a;
        } else if (b < a) {
            biggerNum = a;
            smallerNum = b;
        } else {
            return a;
        }
        boolean found = false;
        int res = 0;
        for (int i = 1; i <= smallerNum; i++) {
            if (biggerNum % i == 0 && smallerNum % i == 0) {
                found = true;
                res = i;
            }
        }
        if (found) {
            return res;
        } else {
            return -1;
        }
    }
}
