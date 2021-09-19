package VideoPlejer;

public class TimeControl extends Control {
	private boolean pomeranjeVremenaUNapred;
		
	public TimeControl(boolean pomeranjeVremenaUNapred) {
		super();
		this.pomeranjeVremenaUNapred = pomeranjeVremenaUNapred;
	}

	public boolean pomeranjeVremenaUNapred() {
		return pomeranjeVremenaUNapred;
	}

	public void setPomeranjeVremena(boolean pomeranjeVremenaUNapred) {
		this.pomeranjeVremenaUNapred = pomeranjeVremenaUNapred;
	}


	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if (pomeranjeVremenaUNapred) {
			if ((vp.getDuzinaVidea() - vp.getTrenutnoVreme()) > 15) {
				vp.setTrenutnoVreme(vp.getTrenutnoVreme() + 15);
			} else {
				vp.setTrenutnoVreme(vp.getTrenutnoVreme());
			}
			
		} else {
			if (vp.getTrenutnoVreme() > 15) {
				vp.setTrenutnoVreme(vp.getTrenutnoVreme() - 15);
			} else {
				vp.setTrenutnoVreme(vp.getTrenutnoVreme());
			}
		}
		
	}

}
