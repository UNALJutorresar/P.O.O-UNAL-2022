
package Ejercicio2;

public class Notas {
    double[] gradelist;
    public Notas(){
        gradelist = new double[5];
        
    }
    double average(){
        double suma=0;
        for(int i=0;i<gradelist.length;i++){
            suma=suma+gradelist[i];
        }
        return (suma/gradelist.length);
    }
    double dstandard(){
        double avg = average();
        double suma=0;
        for(int i=0;i<gradelist.length;i++){
            suma+=Math.pow(gradelist[i]-avg, 2);
        }
        return Math.sqrt(suma/gradelist.length);
    }
    double least(){
        double least=gradelist[0];
        for(int i=0;i<gradelist.length;i++){
            if(gradelist[i]<least){
                least=gradelist[i];
            }
        }
        return least;
    }
    double most(){
        double most=gradelist[0];
        for(int i=0;i<gradelist.length;i++){
            if(gradelist[i]>most){
                most=gradelist[i];
            }
        }
        return most;
    }
    
}
