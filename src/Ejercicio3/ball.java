
package Ejercicio3;
import java.lang.Math;
public class ball extends geomfig {
    private double radio;
    public double calcVol(){
        double vol=1.333*Math.PI*Math.pow(this.radio, 3);
        return vol;
    }
    public double calcSurf(){
        double surf=4*Math.PI*Math.pow(this.radio, 2);
        return surf;
    }
    public ball(double radio){
        this.radio=radio;
        this.setVolume(calcVol());
        this.setSurface(calcSurf());
    }
    
}
