package code.solution;

public class solution1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int xstart = points[0][0];
        int ystart = points[0][1];
        for(int i =1;i<points.length;i++){
            int xstep = points[i][0] - xstart;
            int ystep = points[i][1] - ystart;
            if(xstep < 0){
                xstep = -1 * xstep;
            }
            if(ystep < 0){
                ystep = -1 * ystep;
            }
            if(xstep < ystep){
                res = res + ystep;
            }else {
                res = res + xstep;
            }
            xstart = points[i][0];
            ystart = points[i][1];
        }
        return res;
    }
}
