class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.parallelSort(prices);
        Arrays.parallelSort(discounts);
        int i =prices.length-1;
        int j=discounts.length-1;
       double  mnprice=0;
        while (i>=0 && j>=0){
            mnprice+=(double)(prices[i]*(100-discounts[j]))/100;
            i--;
            j--;
            
        }
        while (i>=0){
            mnprice+=prices[i];
            i--;
        }
        return mnprice;
    }
}
