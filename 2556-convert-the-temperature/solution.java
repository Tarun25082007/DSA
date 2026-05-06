class Solution {
    public double[] convertTemperature(double celsius) {
        double aray[]=new double[2];
        aray[0]=celsius+273.15;
        aray[1]=celsius * 1.80 + 32.00;
        return aray;
    }
}
