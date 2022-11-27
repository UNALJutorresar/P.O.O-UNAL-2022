
package trabajo.pkgfinal;

public class contact {
    private final String nom;
    private final String lastn;
    private final String id;
    
    public contact(String nom, String lastn, String id){
    this.nom=nom;
    this.lastn=lastn;
    this.id=id;
    }
    public String getNom(){
        return nom;
    }
    public String getLastName(){
        return lastn;
    }
    public String getID(){
        return id;
    }
}
