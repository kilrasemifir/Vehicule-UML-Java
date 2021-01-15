package formation.uml.voitures.composants.moteurs;

import formation.uml.voitures.composants.reservoirs.ReservoirErgol;

public interface MoteurErgol extends MoteurThermique {

	public void setReservoir(ReservoirErgol reservoir);
}
