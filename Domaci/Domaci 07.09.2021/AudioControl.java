package VideoPlejer;

public class AudioControl extends Control {
	private boolean pojacavanjeZvuka;
	
	public AudioControl(boolean pojacavanjeZvuka) {
		super();
		this.pojacavanjeZvuka = pojacavanjeZvuka;
	}

	public boolean pojacavanjeZvuka() {
		return pojacavanjeZvuka;
	}

	public void setPojacavanjeZvuka(boolean pojacavanjeZvuka) {
		this.pojacavanjeZvuka = pojacavanjeZvuka;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if (pojacavanjeZvuka) {
			if (vp.getJacinaZvuka() < 100) {
				vp.setJacinaZvuka(vp.getJacinaZvuka() + 1);
			} else {
				vp.setJacinaZvuka(vp.getJacinaZvuka());
			}
		}else {
			if (vp.getJacinaZvuka() > 1) {
				vp.setJacinaZvuka(vp.getJacinaZvuka() - 1);
			} else {
				vp.setJacinaZvuka(vp.getJacinaZvuka());
			}
		}
		
	}




	
}
