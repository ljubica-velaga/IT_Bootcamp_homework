package VideoPlejer;

public class QualityOptimizerControl extends Control {
	private double brzinaInterneta;

	public QualityOptimizerControl(double brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public double getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if ((this.brzinaInterneta * 10.1) < 144) {
			vp.setKvalitetVidea(144);
		} else if ((this.brzinaInterneta * 10.1) > 144 && (this.brzinaInterneta * 10.1) < 240) {
			vp.setKvalitetVidea(240);
		} else if ((this.brzinaInterneta * 10.1) > 240 && (this.brzinaInterneta * 10.1) < 360) {
			vp.setKvalitetVidea(360);
		} else if ((this.brzinaInterneta * 10.1) > 360 && (this.brzinaInterneta * 10.1) < 480) {
			vp.setKvalitetVidea(480);
		} else if ((this.brzinaInterneta * 10.1) > 480 && (this.brzinaInterneta * 10.1) < 720) {
			vp.setKvalitetVidea(720);
		} else if ((this.brzinaInterneta * 10.1) > 720 && (this.brzinaInterneta * 10.1) < 1080) {
			vp.setKvalitetVidea(1080);
		} 
		
	}
	
}
