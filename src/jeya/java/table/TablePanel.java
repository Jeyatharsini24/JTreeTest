package jeya.java.table;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;

import jeya.java.data.Entity;
import jeya.java.dummy.TableDataProvider;

public class TablePanel extends JPanel implements Observer{
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
		
		ArrayList<Entity>tableDummyData = TableDataProvider.getDummyEntities();
		for(int i = 0; i < tableDummyData.size(); i++)
		{
			model.addEntity(tableDummyData.get(i));
		}
		
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true); 
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.weighty = 1.0;
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.gridy = 0;
		gbc_scrollPane.gridx = 0;
		add(scrollPane, gbc_scrollPane);
		
		table.setGridColor(new Color(236,169,28));
		JTableHeader header = table.getTableHeader();
	    header.setBackground(new Color(171,4,51));
	    header.setForeground(Color.yellow);
	    header.setFont(new Font("Cambria", Font.BOLD, 12));
		
		TitledBorder title1;
		Border loweredbevel1;
		loweredbevel1 = BorderFactory.createLoweredBevelBorder();
		title1 = BorderFactory.createTitledBorder(loweredbevel1, "");
		title1.setTitlePosition(TitledBorder.ABOVE_TOP);
		scrollPane.setBorder(title1);
	}

	@Override
	public void update(Observable paramObservable, Object paramObject) {
		System.out.println(paramObject);
	}
}
