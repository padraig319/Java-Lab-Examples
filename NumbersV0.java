public class NumbersV0 {
    public static void main(String[] args) {
        
        final int MIN_VALUE = 179;
        
        final int RANDOM_RANGE = 431 - 179 + 1;
        
        int n, digitTotal;
        
        n = (int)(Math.random()* RANDOM_RANGE + MIN_VALUE);
        
        System.out.println("n is " + n);
        
        digitTotal = n % 10; 
        
        
        n = n / 10; 
        digitTotal = digitTotal + (n % 10); 
        
        
        n = n / 10;
        digitTotal = digitTotal + n;
        
        
        System.out.println("Digit Total is " + digitTotal);
        
    }
}
