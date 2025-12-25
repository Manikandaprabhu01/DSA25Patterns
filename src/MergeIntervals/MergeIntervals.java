package MergeIntervals;


//
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//
//
//
//Example 1:
//
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
//Example 2:
//
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.
//        Example 3:
//
//Input: intervals = [[4,7],[1,4]]
//Output: [[1,7]]
//Explanation: Intervals [1,4] and [4,7] are considered overlapping.
//
//
//        Constraints:
//
//        1 <= intervals.length <= 104
//intervals[i].length == 2
//        0 <= starti <= endi <= 104



import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] resultIntervals  = merge(intervals);
        for(int[] nums : resultIntervals){
                    System.out.println(Arrays.toString(nums));
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        int[][] res = new int[n][2];
        res[0] = intervals[0];
        int e=0;
        for(int i=1;i<n;i++){
            if(intervals[i][0] <= res[e][1]){
                res[e][1] = Math.max(res[e][1], intervals[i][1]);
            }
            else{
                e++;
                res[e] = intervals[i];
            }
        }
        return Arrays.copyOfRange(res,0,e+1);
    }

//    public int[][] merge(int[][] arr) {
//        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
//        List<int[]> ans = new ArrayList<>();
//        for(int i=0; i<arr.length; i++){
//            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1] ){
//                ans.add(arr[i]);
//            }else{
//                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], arr[i][1]);
//            }
//        }
//        return ans.toArray(new int[0][]);
//    }


}







