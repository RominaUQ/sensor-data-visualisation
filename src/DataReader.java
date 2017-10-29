import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DataReader {
	String _filename;

	public DataReader() {

	}

	public DataReader(String filename) {
		_filename = filename;
	}

	public ArrayList<DataInput> read() throws Exception {
		File file = new File(_filename);
		Scanner input = new Scanner(file);
		long sum = 0;

		// String months[] = { "January", "February", "March", "April", "May",
		// "June", "July", "August", "September",
		// "October", "November", "December" };
		// int monthscounts[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		ArrayList<DataInput> dataTotal = new ArrayList<DataInput>();

		while (input.hasNext()) {
			String line = input.nextLine();
			StringTokenizer st = new StringTokenizer(line, ",");
			int num = st.countTokens();
			String subs[] = new String[num];
			int j;

			for (j = 0; j < num; j++) {
				subs[j] = st.nextToken();
			}

			if (subs[9].equals("Hourly_Counts"))
				continue;

			// Check data_G2 if data already exists
			String Year = subs[2];
			String Month = subs[3];
			String Day = subs[5];
			Long Count = Long.parseLong(subs[9]);

			boolean found = false;

			for (DataInput dataRecord : dataTotal) {
				if (dataRecord.getYear().equals(Year) && dataRecord.getMonth().equals(Month)
						&& dataRecord.getDay().equals(Day)) {
					dataRecord.updateCounts(Count);
					found = true;
					break;
				}
			}
			if (!found) {
				DataInput dataInput_new = new DataInput(Year, Month, Day, Count);
				dataTotal.add(dataInput_new);
			}
			// If exists add count

			// If not add new object to list

			// for (int k = 0; k < months.length; k++) {
			// if (line.indexOf(months[k]) >= 0 && subs[2].equals(year)) {
			// monthscounts[k] += Integer.parseInt(subs[j - 1]);
			// }
			// }
		}

		/// for graph 2
		/*
		 * ArrayList<DataInput_G2> data_G2 = new ArrayList<DataInput_G2>(); for
		 * (int k = 0; k < 12; k++) { DataInput_G2 dataInput_G2 = new
		 * DataInput_G2(months[k], monthscounts[k], year);
		 * data_G2.add(dataInput_G2); }
		 * 
		 * ///// for graph 1
		 * 
		 * ArrayList<Datainput_G1> data_G1 = new ArrayList<Datainput_G1>(); for
		 * (int k = 0; k < 12; k++) { Datainput_G1 dataInput_Graph1 = new
		 * Datainput_G1(months[k], monthscounts[k]);
		 * data_G1.add(dataInput_Graph1); }
		 */
		input.close();
		return dataTotal;
	}

}