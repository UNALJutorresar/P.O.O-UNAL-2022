package ejercicio318;

import javax.swing.JFrame;

public class Salarios {
    public static void main(String[] args) {
        Frame1 myframe = new Frame1();
        myframe.setVisible(true);
    }
    
    public static double sb(double horas, double valor) {
    // Calcular salario bruto
    double sb;
    sb = horas*valor;
    return sb;
    }
    
    public static double rf(double horas, double valor, double retencion) {
    // Calcular retención en la fuente
    double rf;
    rf = ((horas*valor)*retencion)/100;
    return rf;
    }
    
    public static double sn(double horas, double valor, double retencion) {
    // Calcular salario neto
    double sn;
    sn = (horas*valor)-(horas*valor)*(retencion/100);
    return sn;
    }
}