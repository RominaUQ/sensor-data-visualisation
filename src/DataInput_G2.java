
public class DataInput_G2 extends Datainput_G1 {
	private String Year;

	public DataInput_G2(String Monthsdata, long Countsdata, String yearsdata) {
		super(Monthsdata, Countsdata);
		Year = yearsdata;
	}

	public String getYear() {
		return Year;
	}
	
	
}