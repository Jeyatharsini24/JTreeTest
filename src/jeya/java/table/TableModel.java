package jeya.java.table;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import jeya.java.data.Entity;
import jeya.java.dummy.TableDataProvider;

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
	
	void loadTable(String userObjectID)
	{
		instances.clear();
		ArrayList<Entity>dummyData = TableDataProvider.getDummyEntities();
		instances = dummyData;
		fireTableDataChanged();
	}
	
	@Override
	public int getRowCount() {
	    return instances != null ? instances.size() : 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return column.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Entity data = instances.get(rowIndex);
	    switch (columnIndex) {
	    case 0:
	      return data.getArg1();
	    case 1:
	      return data.getArg2();
	    case 2:
		  return data.getArg3();
	    }
	    return "";
	}
}
