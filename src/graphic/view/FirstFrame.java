package graphic.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import graphic.controller.FirstGUIController;

public class FirstFrame extends JFrame
{
	private FirstGUIController baseController;
	
	public FirstFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
