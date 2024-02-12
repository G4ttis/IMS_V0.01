import java.awt.*;
import javax.swing.*;

public class MainPanel extends JFrame{
	
	MainContentPanel mainContentPanel = new MainContentPanel(this);
	LateralPanel lateralPanel = new LateralPanel(this);
	
	public MainPanel() {
		
        super("Main");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridBagLayout());
        
        lateralPanel.configurationsLateralPanel();
        add(lateralPanel, lateralPanel.getConstraints());
        
        mainContentPanel.configurationsMainContentPanel();
        add(mainContentPanel, mainContentPanel.getConstraints());

    }

	public MainContentPanel  getMainContentPanel() {
		 return mainContentPanel;
	}
}
