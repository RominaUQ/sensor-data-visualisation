
public class DataInput_G3 extends DataInput_G2 {
	private String _Day;

	public DataInput_G3(String Monthsdata, long counts, String yearsdata, String daydata) {
		super(Monthsdata, counts, yearsdata);
		_Day = daydata;
	}

	public String getDay() {
		return _Day;

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
