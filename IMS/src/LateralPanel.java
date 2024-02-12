import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class LateralPanel extends JPanel {

	private JButton addButton = new JButton("Adicionar ativo");
    private JButton removeButton = new JButton("Remover ativo");
    private MainPanel mainPanel;
    private GridBagConstraints constraints;
    
    public LateralPanel(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        
        setBackground(Color.decode("#1D1D50"));

        addButton.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		String stockName = JOptionPane.showInputDialog(mainPanel, "Informe o nome da ação: ");
        		String stockPrice = JOptionPane.showInputDialog(mainPanel, "Informe o preço da ação: ");
        		double stockPriceToDouble = Double.parseDouble(stockPrice);
        		
        		mainPanel.getMainContentPanel().addStock(stockName, stockPriceToDouble);
        	}
        	
        	
        	
            //@Override
            //public void actionPerformed(ActionEvent e) {
             //   JOptionPane.showMessageDialog(mainPanel, "Ativo adicionado!");
            //}
        });
        
        removeButton.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(mainPanel, "Ativo removido!");
        	}
        });

        add(addButton);
        add(removeButton);
    }
    
    public void configurationsLateralPanel() {
    	
    	constraints = new GridBagConstraints();
    	constraints.gridx = 0;
    	constraints.gridy = 0;
    	constraints.weightx = 0.20;
    	constraints.weighty = 1;
    	constraints.fill = GridBagConstraints.BOTH;
    	
    }
    
    public GridBagConstraints getConstraints() {
    	return constraints;
    }
}