/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_InClass;

/**
 *
 * @author njm5648
 */
public class MVCTempConvert 
{	public static void main(String args[]) 
	{	TemperatureModel temperature = new TemperatureModel();
		new FarenheitGUI(temperature, 100, 100);
		new CelsiusGUI(temperature,100, 250);
                new GraphGUI(temperature,250,500);
                new SliderGUI(temperature,250,250);
	}
}
