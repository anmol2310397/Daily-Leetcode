class Solution {
    public double[] convertTemperature(double celsius) {
       double kelvin=0.0,fahrenheit=0.0;
        double ans[]=new double[2];
        ans[0]=celsius+273.15;
        ans[1]=celsius*1.80+32.00;
        return ans;
    }
}