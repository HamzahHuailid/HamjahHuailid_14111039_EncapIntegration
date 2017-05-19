public abstract class Kendaraan {
    protected String jenis= "Sedan";
    protected int roda = 4;
	

    protected String getJenis(){
        return this.jenis;
    }
    protected int getRoda(){
        return this.roda;
    }    
	
	//method abstrak
    protected abstract void printJenis();
    protected abstract void printRoda();
}