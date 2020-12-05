import bandeau.Bandeau;
import java.awt.Font;
import java.awt.Color;

public class ExempleDUtilisation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         new ExempleDUtilisation2().exemple();
    }
    public void exemple(){

        Bandeau b=new Bandeau();
        ScenarioDAnimation s=new ScenarioDAnimation("l'exemple est terminé bonne journée!");
        b.setMessage("Commençons l'exemple");
        b.sleep(1000);
        b.setMessage("ISIS c'est génial");

        Rotation r1=new Rotation(Vitesse.Rapide,"gauche");
        Rotation r2=new Rotation(Vitesse.Rapide,"droite");
        s.ajouteEffet(r1,1);
        s.ajouteEffet(r2,1);

        LettreAleatoire la=new LettreAleatoire();
        s.ajouteEffet(la,2);
        
        CouleurParLettre cl=new CouleurParLettre(Couleurs.blue);
        cl.ajouteeCouleur(Couleurs.cyan);
        cl.ajouteeCouleur(Couleurs.pink);
        cl.ajouteeCouleur(Couleurs.yellow);
        cl.ajouteeCouleur(Couleurs.red);
        cl.ajouteeCouleur(Couleurs.magenta);
        s.ajouteEffet(cl,1);

        s.lancementDuScenario(b);
        
        

    }
}
