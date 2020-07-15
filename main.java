import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    


    public static void main(String[] args) {
    
        String choix;
             Scanner clavier=new Scanner(System.in);
             Service service =new Service();
            do {
        
                System.out.println("1-Ajout Service");
                System.out.println("2-Lister Services");
                System.out.println("3-Affecter un employer dans un service");
                System.out.println("4-Lister les employers d'un service");
                System.out.println("5-Quitter");
                System.out.println("Faites votre choix");
                choix=clavier.nextLine();
                switch(choix){
                    case "1":
                    System.out.println("Entrer le libelle du service");
                       String libelle =clavier.nextLine();
                       
                    break;
        
                    case "2":
        
                    service.listerService();
                    break;
        
                    case "3":
                    System.out.println("Entrer le Nom Complet");
                    String nomComplet =clavier.nextLine();
                    }
                        System.out.println("Entrer la date d'embauche");
                        LocalDate dateEmb = LocalDate.now();
                        Employe emp = new Emp(nomComplet, salaire, dateEmb);
                        service.ajouterEmploye(emb);

                    }
        
                    case "4":
        
                    service.listerEmployer();
                    break;
        
                    
                    break;
        
                }
                
            } while (choix!="5");
        
                
        }


}