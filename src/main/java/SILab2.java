public class SILab2 {
    static boolean checkPrime(int n) {//1
        if (n < 0) {//2
            throw new RuntimeException("Number should not be negative");//3
        }//4
        int m = n / 2;//5
        if (n == 0 || n == 1) {//6
            return false;//7
        } //8
        else {//9
            for (int i = 2; i <= m; i++) {//10 {10.1, 10.2, 10.3}
                if (n % i == 0) {//11
                    return true;//12
                }//13
            }//14
            return false;//15
        }//16
    }//17
}
