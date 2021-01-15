package formation.uml.voitures.samples;

import formation.uml.voitures.composants.batteries.Batterie;
import formation.uml.voitures.composants.moteurs.MoteurElectrique;

public class MoteurTesla147kW implements MoteurElectrique {

	private Batterie batterie;
	
	public MoteurTesla147kW(Batterie batterie) {
		super();
		this.batterie = batterie;
	}

	@Override
	public void setBatterie(Batterie batterie) {
		this.batterie = batterie;
	}

	@Override
	public String toString() {
		return "MoteurTesla147kW [batterie=" + batterie + "]";
	}
	
	

}
