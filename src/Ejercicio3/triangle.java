
package Ejercicio3;
import java.lang.Math;
public class triangle extends geomfig{
    private double base;
    private double height;
    private double apotema;
    public double calcVol(){
        double vol= (Math.pow(base, 2)*height)/3;
        return vol;
    }
    public double calcSurf(){
        double areaBase=Math.pow(base, 2);
        double areaLado=2*base*apotema;
        return areaBase+areaLado;
    }
    public triangle(double base, double height, double apotema){
        this.base=base;
        this.height=height;
        this.apotema=apotema;
        this.setVolume(calcVol());
        this.setSurface(calcSurf());
    }
    
}
