package formation.uml.voitures.composants.moteurs;

import formation.uml.voitures.composants.batteries.Batterie;

public interface MoteurElectrique extends Moteur {

	public void setBatterie(Batterie batterie);
}
