package jeya.java.table;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
	}
}
