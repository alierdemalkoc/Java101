package siir;

public class Kosma extends HalkSiiri {
	private String onBirliHece;
	private String sonDortlukteMahlas;

	public Kosma(String sair, String siirinAdi) {
		super(sair, siirinAdi);
	}
	
	@Override
	public void setOlcu(String heceOlcusu) {
		heceOlcusu = onBirliHece;
	}
	
	@Override
	public void oku(String ses) {
		ses = ses + sonDortlukteMahlas;
		System.out.println(ses + "ile okuyor");
	}

}
