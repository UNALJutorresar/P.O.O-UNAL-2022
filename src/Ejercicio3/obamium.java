
package Ejercicio3;
import java.lang.Math;
public class obamium extends geomfig{
    private double height;
    private double width;
    private double basetri;
    private double triangle2;
    private double triangle3;
    public double calcVol(){
        double vol=(basetri*height*width)/2;
        return vol;
    }
    public double calcSurf(){
        double surf=basetri*height+basetri*width+triangle2*width+triangle3*width;
        return surf;
    }
    public obamium(double height, double width, double basetri, double triangle2, double triangle3){
        this.height=height;
        this.width=width;
        this.basetri=basetri;
        this.triangle2=triangle2;
        this.triangle3=triangle3;
        this.setVolume(calcVol());
        this.setSurface(calcSurf());
    }
}
