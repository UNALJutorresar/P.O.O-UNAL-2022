
package Ejercicio3;
import java.lang.Math;
public class cube extends geomfig{
    double arista;
    public double calcVol(){
        double vol=Math.pow(arista, 3);
        return vol;
    }
    public double calcSurf(){
        double surf=6*Math.pow(arista, 2);
        return surf;
    }
    public cube(double arista){
        this.arista=arista;
        this.setVolume(calcVol());
        this.setSurface(calcSurf());
    }
}
