public class largest_prime_factor {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i <n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        if (isPrime(17)) {
            System.out.println("it is prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
