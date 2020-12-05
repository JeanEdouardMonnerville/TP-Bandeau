import java.util.Random;
import bandeau.Bandeau;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Jean-Edouard
 */
public class CouleurParLettre extends EffetDAnimation {
    ArrayList<Couleurs> couleurUtilisees;

    public CouleurParLettre(Couleurs c){
       
        couleurUtilisees=new ArrayList<>();
        ajouteeCouleur(c);

        }

    public void ajouteeCouleur(Couleurs c){
        couleurUtilisees.add(c);
    }

    private void attributionDesCouleur(Bandeau b,Couleurs c){
        switch(c){

            case blue:
            b.setForeground(Color.BLUE);
            break;

            case cyan:
            b.setForeground(Color.CYAN);
            break;

            case green:
            b.setForeground(Color.GREEN);
            break;

            case magenta:
            b.setForeground(Color.MAGENTA);
            break;

            case orange:
            b.setForeground(Color.ORANGE);
            break;

            case pink:
            b.setForeground(Color.PINK);
            break;
                
            case red:
            b.setForeground(Color.RED);
            break;

            case yellow:
            b.setForeground(Color.YELLOW);
            break;
           }
    }
    public void excecuteEffet(Bandeau b){
        String messageInitial=b.getMessage();
        Font font=b.getFont();

        Random rd=new Random();
        int n=couleurUtilisees.size();
        int index=0;

        char[] listeChar=b.getMessage().toCharArray();
        b.setFont(new Font("Dialog", Font.BOLD, 65));
        for(char c:listeChar){
            index=rd.nextInt(n);
            attributionDesCouleur( b,couleurUtilisees.get(index));
            b.setMessage(""+c);
            b.sleep(100);}
        b.setFont(font);
        b.setMessage(messageInitial);   

    }

    

    
}
