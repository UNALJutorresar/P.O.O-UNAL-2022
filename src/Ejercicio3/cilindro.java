
package Ejercicio3;
import java.lang.Math;
public class cilindro extends geomfig {
    private double radio;
    private double height;
    public double calcVol(){
        double vol=Math.PI*height*Math.pow(radio,2.0);
        return vol;
    }
    public double calcSurf(){
        double areaA=2*Math.PI*radio*height;
        double areaB=2*Math.PI*Math.pow(radio,2);
        return areaA+areaB;
    }
    public cilindro(double radio, double height){
        this.radio=radio;
        this.height=height;
        this.setVolume(calcVol());
        this.setSurface(calcSurf());
    }
    
}
