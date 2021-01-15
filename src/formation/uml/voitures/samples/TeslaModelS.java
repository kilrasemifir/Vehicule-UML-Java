package formation.uml.voitures.samples;

import java.util.List;

import formation.uml.voitures.composants.moteurs.Moteur;
import formation.uml.voitures.composants.moteurs.MoteurElectrique;
import formation.uml.voitures.vehicules.types.Voiture;

public class TeslaModelS implements Voiture {

	private MoteurElectrique moteur;
	
	public TeslaModelS(MoteurElectrique moteur) {
		super();
		this.moteur = moteur;
	}

	@Override
	public Moteur getMoteur() {
		return this.moteur;
	}

	@Override
	public void transporter(List<String> passages) {
		for (String passage : passages) {
			System.out.println("[Tesla Model S]: transporte "+passage);
		}
	}

	@Override
	public int getRoues() {
		return 4;
	}

	@Override
	public String toString() {
		return "TeslaModelS [moteur=" + moteur + "]";
	}
	
	

}
