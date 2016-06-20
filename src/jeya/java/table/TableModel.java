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
	
	Entity getEntityAt(int rowNumber)
	{
		return instances.get(rowNumber);
	}
	
	void addEntity(Entity entity)
	{
		Object[]row = new Object[column.length];
		row[0] = entity.getUserObjectID();
		row[1] = entity.getArg1();
		row[2] = entity.getArg2();
		row[3] = entity.getArg3();
		addRow(row);
	}
	
	void loadTable(String userObjectID)
	{
		instances.clear();
		ArrayList<Entity>dummyData = TableDataProvider.getInstance().getDummyEntities();
		ArrayList<Entity>filteredData = new ArrayList<Entity>();
		for(int i = 0; i < dummyData.size(); i++)
		{
			Entity temp = dummyData.get(i);
			if(temp.getUserObjectID().contains(userObjectID))
			{
				filteredData.add(temp);
			}
		}
		instances = filteredData;
		fireTableDataChanged();
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Entity data = instances.get(rowIndex);
	    switch (columnIndex) {
	    case 0:
		  return data.getUserObjectID();
	    case 1:
	      return data.getArg1();
	    case 2:
	      return data.getArg2();
	    case 3:
		  return data.getArg3();
	    }
	    return "";
	}
	
	// should override these two methods: internally invoked to show table
	@Override
	public int getRowCount() {
	    return instances != null ? instances.size() : 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return column.length;
	}
}
