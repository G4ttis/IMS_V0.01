import java.awt.*;
import javax.swing.*;


public class MainContentPanel extends JPanel{

	private MainPanel mainPanel;
	private GridBagConstraints constraints;
	
	public MainContentPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
		
        setBackground(Color.decode("#5151E0"));
	}

	public void configurationsMainContentPanel() {
		
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		
	}

	public GridBagConstraints getConstraints() {
		return constraints;
	}
	
	public void addStock(String name, double price) {
		
		JLabel actionLabel = new JLabel("Ação: " + name + ", Preço: " + price);
		add(actionLabel, new GridBagConstraints());
    
	}
	
}
