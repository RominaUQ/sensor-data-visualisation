import java.util.*;
import java.io.*;
import java.time.Month;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.geometry.*;

public class Sensor extends Application {
	public static void main(String[] args) throws Exception {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		DataReader reader = new DataReader("Pedestrian_volume.csv");

		ArrayList<DataInput> allData = reader.read();
		// showgraph1(stage, allData);
		// showgraph2(stage, allData);
		showgraph3(stage, allData);
	}

	//// graph1
	public void showgraph1(Stage stage, ArrayList<DataInput> allData) {

		ArrayList<Datainput_G1> dataGraph1 = new ArrayList<Datainput_G1>();

		for (DataInput sourceData : allData) {
			boolean found = false;
			for (Datainput_G1 dataRecord : dataGraph1) {
				if (dataRecord.getMonth().equals(sourceData.getMonth())) {
					dataRecord.updateCounts(sourceData.getCounts());
					found = true;
					break;
				}
			}
			if (!found) {
				Datainput_G1 dataInput_new = new Datainput_G1(sourceData.getMonth(), sourceData.getCounts());
				dataGraph1.add(dataInput_new);
			}

		}

		stage.setTitle("Bar oogleChart 1");

		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
		bc.setTitle("Number of Pedestrians by Month");
		xAxis.setLabel("Year");
		yAxis.setLabel("Passenger Counts");
		bc.setLegendSide(Side.RIGHT);

		XYChart.Series series1 = new XYChart.Series();
		series1.setName("Months");

		for (Datainput_G1 dataitem : dataGraph1) {
			series1.getData().add(new XYChart.Data(dataitem.getMonth(), dataitem.getCount()));
		}

		Scene scene = new Scene(bc, 800, 600);
		bc.getData().addAll(series1);
		stage.setScene(scene);
		stage.show();
	}

	//////////////////////////////////////////
	///////// graph2

	public void showgraph2(Stage stage, ArrayList<DataInput> allData) {

		ArrayList<DataInput_G2> dataGraph2 = new ArrayList<DataInput_G2>();

		for (DataInput sourceData : allData) {
			boolean found = false;
			for (DataInput_G2 dataRecord : dataGraph2) {
				if (dataRecord.getMonth().equals(sourceData.getMonth())
						&& dataRecord.getYear().equals(sourceData.getYear())) {
					dataRecord.updateCounts(sourceData.getCounts());
					found = true;
					break;
				}
			}
			if (!found) {
				DataInput_G2 dataInput_new = new DataInput_G2(sourceData.getMonth(), sourceData.getCounts(),
						sourceData.getYear());
				dataGraph2.add(dataInput_new);
			}

		}

		stage.setTitle("Bar Chart 2");

		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
		bc.setTitle("Number of Pedestrians by Month and year");
		xAxis.setLabel("Year");
		yAxis.setLabel("Passenger Counts");
		bc.setLegendSide(Side.RIGHT);

		XYChart.Series series1 = new XYChart.Series();
		XYChart.Series series2 = new XYChart.Series();
		XYChart.Series series3 = new XYChart.Series();
		XYChart.Series series4 = new XYChart.Series();
		XYChart.Series series5 = new XYChart.Series();
		series1.setName("2012");
		series2.setName("2013");
		series3.setName("2014");
		series4.setName("2015");
		series5.setName("2016");

		for (DataInput_G2 dataitem : dataGraph2) {
			if (dataitem.getYear().equals("2012")) {
				series1.getData().add(new XYChart.Data(dataitem.getMonth(), dataitem.getCount()));
			} else if (dataitem.getYear().equals("2013")) {
				series2.getData().add(new XYChart.Data(dataitem.getMonth(), dataitem.getCount()));
			} else if (dataitem.getYear().equals("2014")) {
				series3.getData().add(new XYChart.Data(dataitem.getMonth(), dataitem.getCount()));
			} else if (dataitem.getYear().equals("2015")) {
				series4.getData().add(new XYChart.Data(dataitem.getMonth(), dataitem.getCount()));
			} else if (dataitem.getYear().equals("2016")) {
				series5.getData().add(new XYChart.Data(dataitem.getMonth(), dataitem.getCount()));
			}
		}
		Scene scene = new Scene(bc, 800, 600);
		bc.getData().addAll(series1);
		bc.getData().addAll(series2);
		bc.getData().addAll(series3);
		bc.getData().addAll(series4);
		bc.getData().addAll(series5);
		stage.setScene(scene);
		stage.show();
	}

	///////////////////////// Graph3
	//////////////////////////////////////////////
	public void showgraph3(Stage stage, ArrayList<DataInput> allData) {

		ArrayList<DataInput_G3> dataGraph3 = new ArrayList<DataInput_G3>();

		for (DataInput sourceData : allData) {
			boolean found = false;
			for (DataInput_G3 dataRecord : dataGraph3) {
				if (dataRecord.getYear().equals(sourceData.getYear())
						&& dataRecord.getDay().equals(sourceData.getDayofWeek())) {
					dataRecord.updateCounts(sourceData.getCounts());
					found = true;
					break;
				}
			}
			if (!found) {
				DataInput_G3 dataInput_new = new DataInput_G3(sourceData.getMonth(), sourceData.getCounts(),
						sourceData.getYear(), sourceData.getDayOfWeek());
				dataGraph3.add(dataInput_new);
			}

		}

		stage.setTitle("Bar Chart 3");

		final NumberAxis xAxis = new NumberAxis();
		final NumberAxis yAxis = new NumberAxis();
		final BubbleChart<Number, Number> bubc = new BubbleChart<Number, Number>(xAxis, yAxis);
		bubc.setTitle("Number of Pedestrians by Day");
		xAxis.setLabel("Day of Week");
		yAxis.setLabel("Passenger Counts");
		bubc.setLegendSide(Side.RIGHT);

		XYChart.Series series1 = new XYChart.Series();
		XYChart.Series series2 = new XYChart.Series();

		series1.setName("2012");
		series2.setName("2016");

		for (DataInput_G3 dataitem : dataGraph3) {
			if (dataitem.getYear().equals("2012")) {
				series1.getData().add(new XYChart.Data(dataitem.getDayOfWeek(), dataitem.getCount()));
			} else if (dataitem.getYear().equals("2016")) {
				series2.getData().add(new XYChart.Data(dataitem.getDayOfWeek(), dataitem.getCount()));
			}
		}

		Scene scene = new Scene(bubc, 800, 600);
		bubc.getData().addAll(series1, series2);
		stage.setScene(scene);
		stage.show();
	}
}