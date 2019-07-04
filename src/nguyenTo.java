public class nguyenTo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (count == 20){
                break;
            }
            if (isPrimeNumber(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
