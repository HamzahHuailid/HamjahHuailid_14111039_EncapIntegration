public class TurunanKendaraan extends Kendaraan{
	
	
	protected void printJenis(){
	System.out.println("Jenis Kendaraan = "+super.getJenis());
	}
	protected void printRoda(){
		System.out.println("Jumlah Roda = "+super.getRoda());
	}
	
}