package array;

public class rain1 {
    public static int trappedWater(int[] height) {
        int n = height.length;

        // Calculate left max
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trapped = 0;
        // Loop
        for (int i = 0; i < n; i++) {
            // Water trapped = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapped += waterLevel - height[i];
        }
        return trapped;
    }

    public static void main(String[] args) {
        int height[] = {2, 34, 5, 6, 7, 7};
        int result = trappedWater(height);
        System.out.println("Water trapped: " + result);
    }
}
