package siir;

public class TurkSanatMuzigi extends DivanSiiri implements KanunlaSoylenir {
	
	private String sanatMuzigiSanatcısı;
	

	public TurkSanatMuzigi(String sair, String siirinAdi) {
		super(sair, siirinAdi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kanunlaSoyle() {
		System.out.println(sanatMuzigiSanatcısı + "söylüyor.");
	}

}
