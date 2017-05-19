public class memanggil{
	public static void main(String []args){
	TurunanKendaraan k = new TurunanKendaraan();
	System.out.println("INI UNTUK ABSTRAKSI");
	System.out.println("=======================");
	k.printJenis();
	k.printRoda();
	
	Mobil mbl = new Mobil();
    mbl.setMerk("Honda");
    mbl.setTransmisi("Automatic");     
	System.out.println();
	System.out.println("INI UNTUK ENKAPSULASI");
	System.out.println("=======================");
    System.out.println("Merk Mobil  = "+mbl.getMerk());
    System.out.println("Jenis Transmisi  = "+mbl.getTransmisi());
	}
}