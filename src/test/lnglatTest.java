package test;


public class lnglatTest {

    public static final float DEG2RAD = 0.017453292f;
    public static final float RAD2DEG = 57.29578F;
    private static final double C_EARTH = 6378137.0;

    public static double[] lnglatOffset(double latitude,double longitude,double a,double distance) {
        double arc = C_EARTH;
        longitude += distance*Math.sin(a)/(arc*Math.cos(latitude)*2*Math.PI/360);
        latitude += distance*Math.cos(a)/(arc*2*Math.PI/360);

        return new double[]{longitude, latitude};
    }
}
