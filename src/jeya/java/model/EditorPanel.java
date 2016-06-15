package jeya.java.model;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class EditorPanel extends JPanel {
	public EditorPanel()
	{
		setLayout(new GridBagLayout());
		setBackground(new Color(229,156,59));
		
		TitledBorder title1;
		Border raisedbevel1;
		raisedbevel1 = BorderFactory.createRaisedBevelBorder();
		title1 = BorderFactory.createTitledBorder(raisedbevel1, "");
		title1.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		
		this.setBorder(title1);
	}
}
