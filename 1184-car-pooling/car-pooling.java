class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
int sum = 0 ;
for (int i = 0 ; i<trips.length ;i++){ 
    sum += trips[i][0];
 minheap.add(new int[]{ trips[i][0], trips[i][2] });
    if (sum > capacity ){
        while (minheap.peek() != null && trips[i][1]>=minheap.peek()[1]){
            sum -= minheap.peek()[0];
            minheap.remove();
        }
    }
    if (sum>capacity ){
        return false ;
    }
}
 return true  ;

    }
}