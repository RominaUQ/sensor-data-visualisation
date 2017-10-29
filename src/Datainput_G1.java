
public class Datainput_G1 {
	private String _Months;
	private long _Counts;
	

	public Datainput_G1(String Monthsdata, long MonthsCountdata) {
		_Months = Monthsdata;
		_Counts = MonthsCountdata;
	}

	
	public String getMonth() {
		return _Months;
	}

	public long getCount() {
		return _Counts;
	}
	public void updateCounts(long hourlyCounts) {
		_Counts += hourlyCounts;

	}
}
