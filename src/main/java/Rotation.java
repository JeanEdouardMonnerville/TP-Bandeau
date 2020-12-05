import bandeau.Bandeau; 
/**
 *Cet effet fait tourner le message vers la droite ou vers la gauche
 * Trois vitesse sont disponibles
 */
public class Rotation extends EffetDAnimation {
    private String sensRotation;
    private Vitesse vitesseRotation;
    private int speed;

    public Rotation(Vitesse vitesseRotation,String sensRotation){
  
        if (sensRotation!="gauche" || sensRotation!="droite"){
            throw new IllegalArgumentException("Le sens de rotation ne peut prendre que la valeur droite ou gauche");}

        this.sensRotation=sensRotation;
        this.vitesseRotation=vitesseRotation;
        speed=vitesseEnSleep();
    }
    private int vitesseEnSleep(){
        if(vitesseRotation==Vitesse.Lent){
            return 500;
        }
        if(vitesseRotation==Vitesse.Normal){
            return 100;
        }
        if(vitesseRotation==Vitesse.Rapide){
            return 50;
        }
        return 0;
    }


    private void versLaGauche(Bandeau b){
        for (int i = 0; i <= 100; i++) {
		b.setRotation(-2*Math.PI*i / 100);
		b.sleep(speed);
	}
    }
    private void versLaDroite(Bandeau b){
        for (int i = 0; i <= 100; i++) {
            b.setRotation(2*Math.PI*i / 100);
            b.sleep(speed);
        }
    }

    public void excecuteEffet(Bandeau b){
        if (sensRotation=="gauche"){
            versLaGauche(b);}
        else{
            versLaDroite(b);}
    }
}