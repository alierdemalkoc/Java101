package siir;

public class Siir { 
	private final String sair;
	private final String siirinAdi;	
	private int dizeSayisi;
	private String duygu;
	
	
	public String getSair() {
		return sair;
	}

	public String getSiirinAdi() {
		return siirinAdi;
	}

	public Siir(String sair, String siirinAdi)
{
	this.sair = sair;
	this.siirinAdi = siirinAdi;
}

	public int getDizeSayisi() {
		return dizeSayisi;
	}
	
	public void setDizeSayisi(int dizeSayisi) {
		this.dizeSayisi = dizeSayisi;
	}

	protected String getDuygu() {
		return duygu;
	}


	public final void setDuygu(String OkuyaninDuygusu) {
		this.duygu = OkuyaninDuygusu;
	}

	public void oku(String ses) {
		System.out.println(siirinAdi + "okunuyor.");
	}
	
	

	
}
