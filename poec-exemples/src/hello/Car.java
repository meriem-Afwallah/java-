package hello;

public class Car {
	int capaciteReservoirEssence;
	int consommationEssencePar100Km;
	public int distanceMaximumTheorique() {
		
		return 100* capaciteReservoirEssence / consommationEssencePar100Km;
	}

}
