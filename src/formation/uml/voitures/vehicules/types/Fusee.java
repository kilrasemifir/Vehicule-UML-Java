package formation.uml.voitures.vehicules.types;

import java.util.List;

import formation.uml.voitures.composants.moteurs.MoteurErgol;
import formation.uml.voitures.vehicules.VehiculeVolant;

public interface Fusee extends VehiculeVolant{

	public List<MoteurErgol> getMoteurs();
	public void lancer();
}
