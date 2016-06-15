package jeya.java.dummy;

import jeya.java.tree.Tree;
import jeya.java.tree.UserObject;

public class TreeData {
	private Tree<UserObject>tree;
	
	public TreeData()
	{
		UserObject root = new UserObject("Root Id", "Root Display Name", "");
		tree = new Tree<UserObject>(root);
		
		
	}
}
