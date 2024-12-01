
public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args [0]);
        printPrime(num);
    }

    public static void printPrime(int num) {
        System.out.println("Prime numbers up to " + num + ":");
        int length = isPrime(num).length;
        int countPrime = 0;
        for (int i = 2; i < length; i++) {
            if (isPrime(num)[i] == true){
                System.out.println(i);
                countPrime++;
            }
        }
        int precentge =  (countPrime * 100 / length);
        System.out.println("There are " + countPrime + " primes between 2 and " + num + " (" + precentge + "% are primes)");
    }

    public static boolean[] newArr(int num) {
        boolean[] newArray = new boolean[num + 1];
        for (int i = 0; i < (num + 1); i++) {
            newArray[i] = (i == 0 || i == 1) ? false : true;
        }
        return newArray;
    }

    public static boolean[] isPrime(int num) {
        boolean[] primeArray = newArr(num);
        int prime = 0;
        while (prime < primeArray.length) {
            if (primeArray[prime] == false) {
                prime++;
                continue;
            } else {
                for (int i = prime + 1; i < primeArray.length; i++) {
                    if (i % prime == 0){
                        primeArray [i] = false;
                    }
                }
            }
            prime++;
        }
        return primeArray;
    }
}