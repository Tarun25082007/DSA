class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
  
    // Queue<Integer> x  = new PriorityQueue<>(Comparator.reverseOrder()); 
    // for (int i = 0 ;i<k-1;i++){
    //     x.add(nums[i]);
    // }int i = 0 ;int j = k-1;
    // while (j<nums.length){
    //        x.add(nums[j]);
    //        j++;
    //     r[i] = x.peek();
    //     x.remove(nums[i]);
    //     i++;
    // }
    // this method has higher time complexity so use dequeue
      int r[] = new int[nums.length-k+1];
       Deque<Integer> x  = new ArrayDeque<>(); 
       x.addFirst(0);
    for (int i = 1 ;i<k;i++){
        if (nums[i]>nums[x.peekFirst()]){
            x.addFirst(i);
        }
        else{
              while(x.isEmpty()== false && nums[x.peekLast()]<nums[i]){
            x.removeLast();
        }
            x.addLast(i);
        }
    }int i = 0 ;int j = k;
    while (j<nums.length+1){
        r[i]=nums[x.peekFirst()];
        i++;
        while(x.isEmpty()== false && x.peekFirst()<i){
            x.removeFirst();
        }
        if (j==nums.length){
            j++;
            continue;
        }
        if (x.isEmpty()){
            x.addFirst(j);
        }
       else  if (nums[j]>nums[x.peekFirst()]){
            x.addFirst(j);
        }
        else{   while(x.isEmpty()== false && nums[x.peekLast()]<nums[j]){
            x.removeLast();
        }
            x.addLast(j);
        }
        j++;
        

    }
    return r ;    
    }
}