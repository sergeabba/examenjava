import java.time.LocalDate;
public abstract class Employe implements IEmploye {
    
    // Proprietes
    private int count;
    this.count = 0;
    protected int id;
    protected String nomComplet;
    private LocalDate dateEmb;

    public Employe(){
        this.id = generateId();
    }

    public Employe(String nomComplet){
        this.nomComplet = nomComplet;
        this.dateEmb= dateEmb
        this.id = generateId(); // Ecrire une fonction generateId() qui genere un id unique
    }

    public String getNomComplet(){
        return this.nomComplet;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }

    public int getId(){
        return this.id;
    }
     public int getDateEmb(){
        return this.dateEmb;
    }
    public void setDateEmb(LocalDate dateEmb){
        this.dateEmb = dateEmb;
    }


    @Override
    public String affiche(){
        return "Id: "+this.id+" Nom et Prenom : "+this.nomComplet" Date d'embauche :"this.dateEmb";
    }

    

    private int generateId(){
        return this.count++;
    }

}