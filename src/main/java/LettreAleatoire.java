import java.util.Random;
import bandeau.Bandeau;

/**
 *Cet effet place les lettres de manière aléatoire puis les replacent dans l'ordre
 *
 */
public class LettreAleatoire extends EffetDAnimation {

    public LettreAleatoire(){
        }

    private void apparitionLettre(Bandeau b){
        String messageInitial=b.getMessage();
        //On crée une liste de chaîne de charactère
        char[] listeChar=messageInitial.toCharArray();
        //On crée une chaîne de charactère que l'on va renvoyer
        String message="";
        //On crée un générateur de valeur pseudo-aléatoire
        Random rd=new Random();
        
        //On récupère la taille du message
        int n=messageInitial.length();
        int index=0;

        for(int i=0;i<n;i++){
           //On récupère un indice au hasard
           index=rd.nextInt(n);
           //On ajoute un charactère au message
           message=message+listeChar[index];
           //On l'affiche
           b.setMessage(message);
           b.sleep(100);
        }
    }
    public void excecuteEffet(Bandeau b){
        //On sauvegarge le message initial
        String messageInitial=b.getMessage();
        //On affiche les lettres de manière aléatoire
        apparitionLettre(b);
        //On remet les lettres dans l'ordre
        b.sleep(1000);
        b.setMessage(messageInitial);
        }
}
