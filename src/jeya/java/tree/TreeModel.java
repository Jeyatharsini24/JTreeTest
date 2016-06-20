package jeya.java.tree;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import jeya.java.data.UserObject;
import jeya.java.dummy.TreeDataProvider;

/**
 * 
 * @author JJeyatharsini
 * This class is used to handle the data which shows in the tree.
 * Data shows in the tree can be deleted or inserted or updated
 * runtime easily using this class.
 * Added to tree using setModel method.
 */

public class TreeModel extends DefaultTreeModel{

	private static final long serialVersionUID = 1919065491509752313L;

	private DefaultMutableTreeNode root;
	Hashtable<String,UserObject>userData;
	private static TreeModel modelInstance;

	 private TreeModel()
	 {
	    super(null);
	 }
	 
	 public static TreeModel getInstance()
	 {
		 if(modelInstance == null)
		 {
			 modelInstance = new TreeModel();
		 }
		 return modelInstance;
	 }
	 
	 public void loadData()
	 {
		    userData = TreeDataProvider.getInstance().getDummyUserObjects();
		 	DefaultMutableTreeNode root = new DefaultMutableTreeNode(new UserObjectWrapper(new UserObject("1.0","Root","0")));
			
		 	for(int i = 1; i < 7; i++)
			{
				String key = "Child" + i;
				UserObject tempChild = userData.get(key);
				DefaultMutableTreeNode tempChildUserObject = new DefaultMutableTreeNode(new UserObjectWrapper(tempChild));
				root.add(tempChildUserObject);
	
				for(int j = 1; j < 3; j++)
				{
					String _key = "Step" + i + ":" + j;
					UserObject tempGrandChild = userData.get(_key);
					DefaultMutableTreeNode tempGrandChildUserObject = new DefaultMutableTreeNode(new UserObjectWrapper(tempGrandChild));
					tempChildUserObject.add(tempGrandChildUserObject);
				}
			}
			this.root = root;
			setRoot(root);
	 }
}
