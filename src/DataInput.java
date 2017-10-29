
public class DataInput {
	private String _Day;
	private String _Month;
	private long _Counts;
	private String _Year;

	public DataInput(String Year, String Months, String Day, long Counts) {
		_Year = Year;
		_Month = Months;
		_Day = Day;
		_Counts = Counts;
	}

	public String getYear() {
		return _Year;
	}

	public String getMonth() {
		return _Month;
	}

	public String getDay() {
		return _Day;
	}

	public long getCounts() {
		return _Counts;
	}

	public void updateCounts(long hourlyCounts) {
		_Counts += hourlyCounts;

	}

	public int getDayOfWeek() {
		switch (_Day) {
		case "Monday":
			return 1;
		case "Tuesday":
			return 2;
		case "Wednesday":
			return 3;
		case "Thursday":
			return 4;
		case "Friday":
			return 5;
		case "Saturdat":
			return 6;
		case "Sunday":
			return 7;
		}
		return 0;
	}

}
