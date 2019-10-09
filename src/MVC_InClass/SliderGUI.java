/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_InClass;

import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author njm5648
 */
public class SliderGUI implements Observer
{	public SliderGUI(TemperatureModel m, int h, int v)
	{	m.addObserver(this); //Observe the temperature model
		model = m;
		sliderFrame.add(tempControl);
		tempControl.addAdjustmentListener(new SlideListener());
		sliderFrame.setSize(250,50);
		sliderFrame.setLocation(h, v);
		sliderFrame.setVisible(true);
		sliderFrame.addWindowListener(new TemperatureGUI.CloseListener());		
	}
	
	public void update(Observable t, Object o)
	{	double temp = ((TemperatureModel)t).getC();
		tempControl.setValue((int)temp); // Move the slider thumb
	}
	
	class SlideListener implements AdjustmentListener
	{	public void adjustmentValueChanged(AdjustmentEvent e)
		{	model.setC(tempControl.getValue());
		}
	}
	
	private Scrollbar tempControl = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, -50, 160);
	private TemperatureModel model = null;
	private Frame sliderFrame = new Frame("Celsius");
}