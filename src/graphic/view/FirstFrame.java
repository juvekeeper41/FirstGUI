package graphic.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import graphic.controller.FirstGUIController;

public class FirstFrame extends JFrame
{
	private FirstGUIController baseController;
	private FirstPanel appPanel;
	
	public FirstFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new FirstPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Wow a Window!");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
