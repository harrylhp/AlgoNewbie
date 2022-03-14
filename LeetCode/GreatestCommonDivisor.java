package LeetCode;

//Greatest common divisor : biggest number that X can divide both A & B
//Constraint : number must be non-zeo
public class GreatestCommonDivisor {
    public static void main (String []args){
        System.out.println("GCD of 8 and 20 : " + gcd(8,20));
        System.out.println("GCD of 1 and 6 : " + gcd(1,6));
        System.out.println("GCD of 3 and 3 : " + gcd(3,3));

        System.out.println("GCD of 8 and 20 : " + gcdByEuclidsAlgorithm(8,20));
        System.out.println("GCD of 8 and 20 : " + gcdByEuclidsAlgorithm(2,2));
        //System.out.println("GCD of 1 and 6 : " + gcdByEuclidsAlgorithm(1,6));
    }

    // NOTE: a % b meaning take the modulus of (a:b)
    public static int gcd(int a, int b){
        int gcd = 1;
        //TODO: i <= Math.min(a,b) as GCD for (3,3) is 3 not 1
        for(int i = 1; i<=Math.min(a,b); i++) {
            if (a%i == 0 && b%i==0)
                gcd = i;
        }
        return gcd;
    }

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
