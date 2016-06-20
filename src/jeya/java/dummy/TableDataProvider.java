package jeya.java.dummy;

import java.util.ArrayList;

import jeya.java.data.Entity;

public class TableDataProvider {
	private static ArrayList<Entity>tableDummyData;
	private static TableDataProvider instance;
	
	private TableDataProvider()
	{
		generateDummyEntities();
	}
	
	public static TableDataProvider getInstance(){
		if(instance == null)
		{
			instance = new TableDataProvider();
		}
		return instance;
	}
	
	public void generateDummyEntities()
	{
		tableDummyData = new ArrayList<Entity>();
		for(int i = 1; i < 7; i++)
		{
			int random = (int)(Math.random() * 1000) % 4 + 1;
			for(int j = 1; j < random; j++)
			{
				String userObjectID = "1.0." + i;
				String arg1 = "arg1:" + i + ":" + j;
				String arg2 = "arg2:" + i + ":" + j;
				String arg3 = "arg3:" + i + ":" + j;
				tableDummyData.add(new Entity(userObjectID,arg1,arg2,arg3));
			}
		}
		for(int i = 1; i < 7; i++)
		{
			for(int j = 1; j < 3; j++)
			{
				int random = (int)(Math.random() * 1000) % 4 + 1;
				for(int k = 1; k < random; k++)
				{
					String userObjectID = "1.0." + i + "." + j;
					String arg1 = "arg1:" + i + ":" + j + ":" + k;
					String arg2 = "arg2:" + i + ":" + j + ":" + k;
					String arg3 = "arg3:" + i + ":" + j + ":" + k;
					tableDummyData.add(new Entity(userObjectID,arg1,arg2,arg3));
				}
			}
		}
	}

	public ArrayList<Entity> getDummyEntities() {
		// TODO Auto-generated method stub
		return tableDummyData;
	}
}
