
package trabajo.pkgfinal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class datalist {
    public Vector list;
    public datalist(){
        list=new Vector();
    }
    public void addList(contact a){
        list.add(a);
    }
    public String[][] matrix(){
        String data[][]=new String[list.size()][3];
        for(int i=0;i<list.size();i++){
            contact e=(contact) list.elementAt(i);
            data[i][0]=e.getNom();
            data[i][1]=e.getLastName();
            data[i][2]=e.getID();
        }
        return data;
    }
    public String convert(){
        String text="";
        for(int i=0;i<list.size();i++){
            contact e=(contact) list.elementAt(i);
            text=text+"Nombre: "+e.getNom()+"\n"+"Apellidos: "+e.getLastName()+"\n"+"Cédula: "+e.getID()+"\n----\n";
        }
        return text;
    }
    
}
