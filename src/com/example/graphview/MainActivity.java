package com.example.graphview;

import com.jjoe64.graphview.*;
import com.jjoe64.graphview.GraphView.GraphViewData;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
		//int num = 50;  
		//GraphViewData[] data = new GraphViewData[num]; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		GraphViewSeries exampleSeries = new GraphViewSeries(new GraphViewData[] {
                new GraphViewData(1, 2.0d)
                , new GraphViewData(2, 1.5d)
                , new GraphViewData(2.5, 3.0d) // another frequency
                , new GraphViewData(3, 2.5d)
                , new GraphViewData(4, 1.0d)
                , new GraphViewData(5, 3.0d)
			});
			  
			GraphView graphView = new LineGraphView(  
			      this // context  
			      , "GraphViewDemo" // heading  
			);  
			graphView.addSeries(exampleSeries); // data  
			  
			LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);  
			layout.addView(graphView);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
