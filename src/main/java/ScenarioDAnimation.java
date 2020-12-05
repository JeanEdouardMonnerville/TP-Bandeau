import bandeau.Bandeau;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;

/**
 *
 * 
 */
public class ScenarioDAnimation {

    private String messageDeFin;
    private ArrayList<Enchainement> enchainements;

    public ScenarioDAnimation(String messageDeFin){
        this.messageDeFin=messageDeFin;
        enchainements=new ArrayList();
    }

    public void ajouteEffet(EffetDAnimation e,int Repetition){

        Enchainement newEnchainement=new Enchainement(e,Repetition,this);
        enchainements.add(newEnchainement);
    }

    public void lancementDuScenario(Bandeau b){
        Font font = b.getFont();
        Color back = b.getBackground();
        Color fore = b.getForeground();

        int n=0;
        for(Enchainement e:enchainements){
            n=e.getRepetition();
            for(int i=0;i<n;i++){
                e.getEffet().excecuteEffet(b);
                }
        }

        b.setFont(font);
	b.setForeground(fore);
	b.setBackground(back);
	b.setMessage(messageDeFin);
	b.sleep(3000);
	b.close();
    }
    
}
