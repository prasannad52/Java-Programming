class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[] = { 60, 100, 120 };
        int val[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
    }
}