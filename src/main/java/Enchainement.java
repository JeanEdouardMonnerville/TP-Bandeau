

/**
 *Classe association reliant les effets d'animation au scénario
 * On ajoute comme information pour chaque association le nombre de répétition
 */
public class Enchainement {
    private final EffetDAnimation myEffet;
    private final ScenarioDAnimation myScenario;
    private int repetition;

    public Enchainement(EffetDAnimation e,int repete,ScenarioDAnimation s){
        myEffet=e;
        myScenario=s;
        repetition=repete;
    }

    public EffetDAnimation getEffet(){
        return myEffet;
    }

    public ScenarioDAnimation getScenario(){
        return myScenario;
    }

    public int getRepetition(){
        return repetition;
    }

    public void setRepetition(int newRepetition){
        repetition=newRepetition;
    }

}
