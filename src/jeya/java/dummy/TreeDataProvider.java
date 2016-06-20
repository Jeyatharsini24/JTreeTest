package jeya.java.dummy;

import java.util.Hashtable;

import jeya.java.data.UserObject;

public class TreeDataProvider {
	private static Hashtable<String,UserObject>treeDummyData;
	private static TreeDataProvider instance;
	
	private TreeDataProvider()
	{
		generateDummyUserObjects();
	}
	
	public static TreeDataProvider getInstance(){
		if(instance == null)
		{
			instance = new TreeDataProvider();
		}
		return instance;
	}
	public void generateDummyUserObjects()
	{
		treeDummyData = new Hashtable<String,UserObject>();
		for(int i = 1; i < 7; i++)
		{
			String userObjectID = "1.0." + i;
			String arg2 = "Node " + i;
			String arg3 = "0";
			String key = "Child" + i;
			UserObject temp = new UserObject(userObjectID,arg2,arg3);
			treeDummyData.put(key, temp);
			//int random = (int)(Math.random() * 1000) % 6 + 1;
			for(int j = 1; j < 3; j++)
			{
				String _userObjectID = "1.0." + i + "." + j;
				String _arg2 = "Node " + i + "." + j;
				String _arg3 = "0";
				String _key = "Step" + i + ":" + j;
				treeDummyData.put(_key, new UserObject(_userObjectID,_arg2,_arg3));
			}
		}
	}

	public Hashtable<String, UserObject> getDummyUserObjects() {
		// TODO Auto-generated method stub
		return treeDummyData;
	}
}
