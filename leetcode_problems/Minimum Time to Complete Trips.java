class Solution {
    public long minimumTime(int[] time, int totalTrips) {

        long start = 1;
        long min = Integer.MAX_VALUE;

        for (int t : time) {
            min = Math.min(min, t);
        }

        long end = min * (long) totalTrips;
        long ans = end;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (canComplete(time, totalTrips, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public boolean canComplete(int[] arr, int trip, long mid) {
        long sum = 0;

        for (int each : arr) {
            sum += mid / each;

            if (sum >= trip) {
                return true;
            }
        }

        return false;
    }
}
