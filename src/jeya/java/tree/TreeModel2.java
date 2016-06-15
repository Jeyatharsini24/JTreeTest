package jeya.java.tree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeModel2 extends DefaultTreeModel{
	private Tree t;
	
	private TreeModel2(Tree t) {
		super(new DefaultMutableTreeNode(t.getRoot()));
	}
}
