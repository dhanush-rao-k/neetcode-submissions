class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> hei = new Stack<>();
        Stack<Integer> ind = new Stack<>();

        int maxarea = 0;

        for (int i = 0; i < heights.length; i++) {
            int start = i;

            while (!hei.isEmpty() && heights[i] < hei.peek()) {
                int h = hei.pop();
                int idx = ind.pop();

                maxarea = Math.max(maxarea, h * (i - idx));
                start = idx;
            }

            hei.push(heights[i]);
            ind.push(start);
        }

        int n = heights.length;

        while (!hei.isEmpty()) {
            int h = hei.pop();
            int idx = ind.pop();

            maxarea = Math.max(maxarea, h * (n - idx));
        }

        return maxarea;
    }
}