package formation.uml.voitures;

import formation.uml.voitures.composants.batteries.Batterie;
import formation.uml.voitures.composants.moteurs.MoteurElectrique;
import formation.uml.voitures.samples.BatterieTesla100kWh;
import formation.uml.voitures.samples.MoteurTesla147kW;
import formation.uml.voitures.samples.TeslaModelS;
import formation.uml.voitures.vehicules.types.Voiture;

public class DemoTesla {

	public static void main(String[] args) {
		Batterie batterie = new BatterieTesla100kWh();
		MoteurElectrique moteur = new MoteurTesla147kW(batterie);
		Voiture tesla = new TeslaModelS(moteur);
		System.out.println(tesla);
	}

}
