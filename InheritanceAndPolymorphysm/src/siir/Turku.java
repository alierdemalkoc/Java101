package siir;

public class Turku extends HalkSiiri implements SazlaSoylenir {
	
	private String turkucu;

	public Turku(String sair, String siirinAdi) {
		super(sair, siirinAdi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sazlaSoyle() {
		System.out.println(turkucu + "söyüyor.");
	}

}
