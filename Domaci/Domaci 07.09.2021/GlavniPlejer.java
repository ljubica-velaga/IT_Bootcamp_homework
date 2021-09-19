package VideoPlejer;

import java.util.ArrayList;

public class GlavniPlejer {

	public static void main(String[] args) {
		VideoPlayer nekiPlejer = new VideoPlayer(270, 128, 23, 240);
		TimeControl pomeranjeUnapred = new TimeControl(true);
		TimeControl pomeranjeUnazad = new TimeControl(false);
		AudioControl pojacavanjeZvuka = new AudioControl(true);
		AudioControl smanjenjeZvuka = new AudioControl(false);
		
		System.out.println(nekiPlejer);
	
		ArrayList<Control> akcije = new ArrayList<>();
		akcije.add(pomeranjeUnapred);
		akcije.add(pojacavanjeZvuka);
		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(nekiPlejer);
		}
		System.out.println(nekiPlejer);
	}

}
