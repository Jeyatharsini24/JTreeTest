package jeya.java.dummy;

import java.util.ArrayList;

import jeya.java.data.Entity;

public class TableDataProvider {
	private static ArrayList<Entity>tableDummyData;
	
	public static ArrayList<Entity> getDummyEntities()
	{
		tableDummyData = new ArrayList<Entity>();
		for(int i = 1; i < 7; i++)
		{
			int random = (int)(Math.random() * 1000) % 6 + 1;
			for(int j = 1; j < random; j++)
			{
				String userObjectID = "1.0." + i;
				String arg1 = "arg1:" + i + ":" + j;
				String arg2 = "arg2:" + i + ":" + j;
				String arg3 = "arg3:" + i + ":" + j;
				tableDummyData.add(new Entity(userObjectID,arg1,arg2,arg3));
			}
		}
		return tableDummyData;
	}
}
