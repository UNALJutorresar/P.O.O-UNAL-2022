package ejercicio407;

public class Ejercicio47 {
    
    public static void main(String[] args) {
    Tab myframe = new Tab();
    myframe.setVisible(true);
    }
    
    public static String compare(double a, double b){
        String string;
        string="";
        if(a>b){
            string="A>B";
        }
        else if (a<b){
            string="B<A";
        }
        else if (a==b){
            string="A=B";
        }
        return string;
    }
}
