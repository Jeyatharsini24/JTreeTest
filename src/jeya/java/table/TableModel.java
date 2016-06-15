package jeya.java.table;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import jeya.java.data.Entity;

public class TableModel extends DefaultTableModel{
	private String[]column;
	private ArrayList<Entity>instances;
	
	TableModel(String[]column,int row)
	{
		super(column,row);
		instances = new ArrayList<Entity>();
		this.column = column;
		setColumnIdentifiers(column);
	}
	
	void addEntity(Entity entity)
	{
		Object[]row = new Object[column.length];
		row[0] = entity.getArg1();
		row[1] = entity.getArg2();
		row[2] = entity.getArg3();
		addRow(row);
	}
	
	void loadTable()
	{
		
	}
}
