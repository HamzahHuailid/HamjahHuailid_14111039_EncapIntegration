public class Mobil {
    private String merk;
    private String transmisi;
    
    //konstruktor
    public Mobil(){
        this.merk="Merk Mobil";
		this.transmisi="Transmisi";
    }
    public Mobil(String m, String t){
        this.merk = m;
		this.transmisi= t;
    }
    
	
  
    public void setMerk(String m){
        this.merk = m;
    }
	
	public void setTransmisi(String t) {
		this.transmisi = t;
	}
		
    public String getMerk(){
        return this.merk;
    }  

	public String getTransmisi(){
        return this.transmisi;
    }
}