
public class Trappedwater {

    public static int result(int heights[]) {
        int n = heights.length;
        int trapped_water = 0;
        // cacluating the left max boundary array
        int left[] = new int[heights.length];
        left[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            left[i] = Math.max(heights[i], left[i - 1]);
        }

        // calculating the right max boundary array
        int right[] = new int[heights.length];
        right[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(heights[i], right[i + 1]);
        }

        // calcualating trapped water
        for (int i = 0; i < heights.length; i++) {
            // calculating the water levels
            int water_level = Math.min(left[i], right[i]);
            // calculating the trapped water
            trapped_water += water_level - heights[i];
        }
        return trapped_water;
    }

    public static void main(String[] args) {
        int heights[] = {5, 4, 3, 2, 1};
        System.out.println(result(heights));
    }
}
