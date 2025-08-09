import java.util.PriorityQueue;

public class WeakestSoldier {
    public static class Weak implements Comparable<Weak> {
        int soldier;
        int idx;

        public Weak(int soldier, int idx) {
            this.soldier = soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Weak p2) {
            if (this.soldier == p2.soldier) {
                return this.idx - p2.idx;
            }
            return this.soldier - p2.soldier;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Weak> pq = new PriorityQueue<>();
        int soldier[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        int k = 2;
        for (int i = 0; i < soldier.length; i++) {
            int count = 0;
            for (int j = 0; j < soldier[0].length; j++) {
                count += soldier[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Weak(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }
}