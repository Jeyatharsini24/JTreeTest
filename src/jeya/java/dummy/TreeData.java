package jeya.java.dummy;

import jeya.java.data.UserObject;
import jeya.java.tree.Tree;

public class TreeData {
	private Tree<UserObject>tree;
	
	public TreeData()
	{
		UserObject root = new UserObject("Root Id", "Root Display Name", "");
		tree = new Tree<UserObject>(root);
		
		
	}
}
