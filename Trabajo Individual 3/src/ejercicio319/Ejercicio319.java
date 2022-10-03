package ejercicio319;

public class Ejercicio319 {

    public static void main(String[] args) {
        Tab myframe = new Tab();
        myframe.setVisible(true);
    }
    
    public static double peri(double lado) {
    double peri;
    peri = lado*3;
    return peri;
    }
    
    public static double altura(double lado) {
    double altura;
    altura = (Math.sqrt(3)*lado)/2;
    return altura;
    }
    
    public static double area(double lado) {
    double area;
    area = (Math.pow(lado,2)*Math.sqrt(3))/4;
    return area;
    }
}
