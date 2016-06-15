package jeya.java.table;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class TablePanel extends JPanel {
	JTable table;
	TableModel model;
	
	public TablePanel()
	{
		this.setLayout(new GridBagLayout());
		table = new JTable();
		table.setBackground(new Color(219,180,143));
		String[]column = new String[]{"Arg1","Arg2","Arg3"};
		model = new TableModel(column,0);
		EvenOddRenderer renderer = new EvenOddRenderer();
		table.setDefaultRenderer(Object.class, renderer);
		table.setModel(model);
		model.addEntity(new Entity("arg1","arg2","arg3"));
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true); 
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.weighty = 1.0;
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.gridy = 0;
		gbc_scrollPane.gridx = 0;
		add(scrollPane, gbc_scrollPane);
		
		TitledBorder title1;
		Border loweredbevel1;
		loweredbevel1 = BorderFactory.createLoweredBevelBorder();
		title1 = BorderFactory.createTitledBorder(loweredbevel1, "");
		title1.setTitlePosition(TitledBorder.ABOVE_TOP);
		scrollPane.setBorder(title1);
	}
}
