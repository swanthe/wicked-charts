package com.googlecode.wickedcharts.showcase.configurations.gridlines;

import java.util.Arrays;

import com.googlecode.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import de.adesso.wickedcharts.chartjs.chartoptions.AxesScale;
import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Dataset;
import de.adesso.wickedcharts.chartjs.chartoptions.GridLines;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import de.adesso.wickedcharts.chartjs.chartoptions.Scales;
import de.adesso.wickedcharts.chartjs.chartoptions.Ticks;
import de.adesso.wickedcharts.chartjs.chartoptions.Title;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

@SuppressWarnings("serial")
public class GridLinesBasicConfiguration extends ShowcaseConfiguration {
	
	protected GridLines gridLines;
	
	public GridLinesBasicConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(Arrays.asList(10, 30, 39, 20, 25, 34, -10))
				.setFill("false");
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(Arrays.asList(18, 33, 22, 19, 11, 39, 30))
				.setFill("false");
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));

		gridLines = new GridLines()
				.setDisplay(true);
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Min and Max Settings"))
				.setScales(new Scales()
						.setXAxes(new AxesScale()
								.setGridLines(gridLines))
						.setYAxes(new AxesScale()
								.setGridLines(gridLines)
								.setTicks(new Ticks()
										.setMin(0)
										.setMax(100)
										.setStepSize(10))))
				;
		setOptions(options);
	}
}
