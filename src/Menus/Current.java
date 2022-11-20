package Menus;
public class Current {
public static double calc_current(double voltage, double resistance){
    double current;
    current = voltage/resistance;
    return current;
}
}
