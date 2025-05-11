public class FriendsPairing {
    public static int pairing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // pairing(n-1) is for single pairing
        // pairing(n-2)*(n-1) is for double pairing
        return (pairing(n - 1) + ((n - 1) * pairing(n - 2)));
    }

    public static void main(String[] args) {
        System.out.println(pairing(5));
    }
}