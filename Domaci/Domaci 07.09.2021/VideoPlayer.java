package VideoPlejer;

public class VideoPlayer {
	private double duzinaVidea;
	private double trenutnoVreme;
	private int jacinaZvuka;
	private int kvalitetVidea;
	
	public VideoPlayer(double duzinaVidea, double trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVreme = trenutnoVreme;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public double getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(double duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public double getTrenutnoVreme() {
		return trenutnoVreme;
	}

	public void setTrenutnoVreme(double trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}

	@Override
	public String toString() {
		return "VideoPlayer [duzinaVidea=" + duzinaVidea + ", trenutnoVreme=" + trenutnoVreme + ", jacinaZvuka="
				+ jacinaZvuka + ", kvalitetVidea=" + kvalitetVidea + "]";
	}
	
	
}
