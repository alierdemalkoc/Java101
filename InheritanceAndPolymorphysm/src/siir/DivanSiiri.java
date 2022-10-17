package siir;

public class DivanSiiri extends Siir{
	private String kanun;
	private String olcu;

	public DivanSiiri(String sair, String siirinAdi) {
		super(sair, siirinAdi);
	}
	
	@Override
	protected String getDuygu() {
		return super.getDuygu();
	}
	
	@Override
	public void setDizeSayisi(int dizeSayisi) {
		System.out.println(dizeSayisi + "İkinin katıdır");
	}
	
	@Override
	public void oku(String ses) {
		ses = ses + kanun;
	}

	public String getOlcu() {
		return olcu;
	}

	public void setOlcu(String aruz) {
		this.olcu = aruz;
	}
	
	

}
