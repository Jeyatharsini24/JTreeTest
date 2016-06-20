package jeya.java.model;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class NewButtonPanel extends JPanel {
	private JeyaActionListener jeyaActionListener = new JeyaActionListener();
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
		btnNew.addActionListener(jeyaActionListener);
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
	
	class JeyaActionListener extends Observable implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent paramActionEvent) {
			setChanged();
			notifyObservers(null);
		}
		
	}
	
	public void addNewButtonClickListener(Observer editorPanel) {
		jeyaActionListener.addObserver(editorPanel);
	}
}
