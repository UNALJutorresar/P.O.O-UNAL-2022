
package trabajo.pkgfinal;

public class contact {
    private String nom;
    private String lastn;
    private String id;
    
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
