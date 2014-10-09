package ctec.secondsillyproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private ArrayList<Integer> colorList;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.boringTextView);
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		setupListeners();
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.darkBlack);
		colorList.add(R.color.darkBlue);
		colorList.add(R.color.darkGreen);
		colorList.add(R.color.lightGray);
		colorList.add(R.color.darkRed);
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//Button click stuff goes here.
				int randomIndex = (int) (Math.random() * colorList.size());
				
				appButton.setBackgroundResource(colorList.get(randomIndex));
			}
		});
	}
}
