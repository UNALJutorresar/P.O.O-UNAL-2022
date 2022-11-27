package trabajo.pkgfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrabajoFinal {
    // FileNotFoundException es obligatorio
    public static void main(String[] args) throws FileNotFoundException {
        //Iniciamos array of arrays
        List<String[]> reg = new ArrayList<>();
        //Leemos archivo
        File file = new File("C:\\Users\\Camilo\\Desktop\\P.O.O\\Trabajo Final\\trabajo.txt");
        //Iniciamos objeto Scanner
        Scanner sc = new Scanner(file);
        //Loop, lee el archivo linea por linea "\n" separator
        while (sc.hasNextLine()) {
            // Los registros en el archivo están separados por ", "
            String[] componentes = sc.nextLine().split(", ");
            // Append a la lista
            reg.add(componentes);
        }
        //Imprimimos según índice
        System.out.println(Arrays.toString(reg.get(0)));
        System.out.println(Arrays.toString(reg.get(1)));
    } 
}