package jeya.java.tree;

import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * 
 * @author JJeyatharsini
 * This class is used to handle the data which shows in the tree.
 * Data shows in the tree can be deleted or inserted or updated
 * runtime easily using this class.
 * Added to tree using setModel method.
 */

public class TreeModel extends DefaultTreeModel {

	private static final long serialVersionUID = 1919065491509752313L;

	private DefaultMutableTreeNode root;
	ArrayList<UserObject>contactData;
	private static TreeModel modelInstance;

	 private TreeModel()
	  {
	    super(null);
	    contactData = new ArrayList<UserObject>();
	    contactData.add(new UserObject("1.0.1","Node 1","0"));
	    contactData.add(new UserObject("1.0.2","Node 2","0"));
	    contactData.add(new UserObject("1.0.3","Node 3","0"));
	    contactData.add(new UserObject("1.0.4","Node 4","0"));
	    contactData.add(new UserObject("1.0.5","Node 5","0"));
	    contactData.add(new UserObject("1.0.6","Node 6","0"));

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
		 	DefaultMutableTreeNode root = new DefaultMutableTreeNode(new UserObjectWrapper(new UserObject("1.0","Root","0")));
			for(int i = 0; i < contactData.size(); i++)
			{
				root.add(new DefaultMutableTreeNode(new UserObjectWrapper(contactData.get(i))));
			}
			this.root = root;
			setRoot(root);
	 }
}
