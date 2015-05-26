package smallest.multiple;

/**
 *
 * @author KW
 */

public class SmallestMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Poszukiwana liczba to: " + smallestMultiple(20));
    }
    
    public static short highestPrime(short maxNum)
    {
        
        for (short i=maxNum;i>=1;i--) {
            boolean isPrime = true;
            for (int j=i-1;j>1;j--)
            {
                if(i%j == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)
            {
                return i;
            }
        }
        return 0;
    }
    
    public static int smallestMultiple(int upperLimit)
    {
        int highestPrime = highestPrime((short)upperLimit);
        int product = highestPrime*upperLimit;
        for(int i=product;;i+=product)
        {
            boolean canBeDivided = true;
            System.out.println("Sprawdzam liczbę: " + i);
            
            for(int j=1;j<=upperLimit;++j)
            {
                if(i % j != 0)
                {
                    canBeDivided = false;
                    break;
                }
            }
            if(canBeDivided)
                return i;
        }
    }    
}
