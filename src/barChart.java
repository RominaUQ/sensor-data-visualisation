/*import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.chart.BarChart;
	import javafx.scene.chart.CategoryAxis;
	import javafx.scene.chart.NumberAxis;
	import javafx.scene.chart.XYChart;
	import javafx.stage.Stage;

	
	public class BarChartSample extends Application {
	    final static String January = "January";
	    final static String February = "February";
	    final static String March = "March";
	    final static String April = "April";
	    final static String May = "May";
	    final static String June = "June";
	    final static String July = "July";
	    final static String August = "August"
	    final static String September = "September";
	    final static String October = "October";
	    final static String November = "November";
	    final static String December = "December";
	 
	    @Override public void start(Stage stage) {
	        stage.setTitle("Bar Chart 1");
	        final CategoryAxis xAxis = new CategoryAxis();
	        final NumberAxis yAxis = new NumberAxis();
	        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
	        bc.setTitle("Number of Pedestrians by Month");
	        xAxis.setLabel("Months");       
	        yAxis.setLabel("Counts");
	 
	        for (DataInput dataitem: data) {
	        	
	        }
	        
	        XYChart.Series series1 = new XYChart.Series();
	        series1.setName("2009_2012");       
	        
	        series1.getData().add(new XYChart.Data( datainput, 25601.34));
	        //series1.getData().add(new XYChart.Data(brazil, 20148.82));
	        //series1.getData().add(new XYChart.Data(france, 10000));
	        //series1.getData().add(new XYChart.Data(italy, 35407.15));
	        //series1.getData().add(new XYChart.Data(usa, 12000));      
	        
	        /*XYChart.Series series2 = new XYChart.Series();
	        series2.setName("2004");
	        series2.getData().add(new XYChart.Data(austria, 57401.85));
	        series2.getData().add(new XYChart.Data(brazil, 41941.19));
	        series2.getData().add(new XYChart.Data(france, 45263.37));
	        series2.getData().add(new XYChart.Data(italy, 117320.16));
	        series2.getData().add(new XYChart.Data(usa, 14845.27));  
	        
	        XYChart.Series series3 = new XYChart.Series();
	        series3.setName("2005");
	        series3.getData().add(new XYChart.Data(austria, 45000.65));
	        series3.getData().add(new XYChart.Data(brazil, 44835.76));
	        series3.getData().add(new XYChart.Data(france, 18722.18));
	        series3.getData().add(new XYChart.Data(italy, 17557.31));
	        series3.getData().add(new XYChart.Data(usa, 92633.68)); 
	        
	        Scene scene  = new Scene(bc,800,600);
	        bc.getData().addAll(series1, series2, series3);
	        stage.setScene(scene);
	        stage.show();
	    }
	 
	    public static void main(String[] args) {
	        launch(args);
	    }
	}*/


