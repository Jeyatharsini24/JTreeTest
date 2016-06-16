package jeya.java.model;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class NewButtonPanel extends JPanel {
	public NewButtonPanel()
	{
		this.setLayout(new GridBagLayout());
		this.setBackground(new Color(219,180,143));
		
		TitledBorder title1;
		Border loweredbevel1;
		loweredbevel1 = BorderFactory.createLoweredBevelBorder();
		title1 = BorderFactory.createTitledBorder(loweredbevel1, "");
		title1.setTitlePosition(TitledBorder.ABOVE_TOP);
		this.setBorder(title1);
		
		JButton btnNew = new JButton("New");
		GridBagConstraints gbc_btnNew = new GridBagConstraints();
		gbc_btnNew.anchor = GridBagConstraints.EAST;
		gbc_btnNew.weighty = 1.0;
		gbc_btnNew.weightx = 1.0;
		gbc_btnNew.gridx = 10;
		gbc_btnNew.gridy = 0;
		add(btnNew, gbc_btnNew);
		
		TitledBorder title2;
		Border loweredbevel2;
		loweredbevel2 = BorderFactory.createRaisedBevelBorder();
		title2 = BorderFactory.createTitledBorder(loweredbevel2, "");
		title2.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		btnNew.setBorder(title2);
	}
}
