package siir;

public class HalkSiiri extends Siir{
	
	private String saz;
	private String olcu;

	public HalkSiiri(String sair, String siirinAdi) {
		super(sair, siirinAdi);
	}
	
	@Override
	public void oku(String ses) {
		ses = ses + saz;
	}
	
	@Override
	protected String getDuygu() {
		return super.getDuygu();
	}

	@Override
	public void setDizeSayisi(int dizeSayisi) {
		System.out.println(dizeSayisi +  "Dördün katıdır");
	}

	public String getOlcu() {
		return olcu;
	}

	public void setOlcu(String heceOlcusu) {
		this.olcu = heceOlcusu;
	}
	
}
