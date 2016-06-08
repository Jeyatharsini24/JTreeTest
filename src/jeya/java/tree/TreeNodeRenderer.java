package jeya.java.tree;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * 
 * @author JJeyatharsini
 * This class is used to change the representation of tree nodes.
 * Example: Default ImageIcon of tree node can be changed here.
 */

public class TreeNodeRenderer extends DefaultTreeCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3852090654795694547L;

	ImageIcon m_node;
	ImageIcon m_root;
	
	public TreeNodeRenderer()
	{
		m_root = new IconProvider().getIcon(IconProvider.TREE_ROOT);
		m_node = new IconProvider().getIcon(IconProvider.TREE_NODE);
	}
	
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, 
			boolean expanded,
			boolean leaf, int row, boolean hasFocus) 
	{
		super.getTreeCellRendererComponent(tree, value, selected,expanded, leaf, row, hasFocus);
		
		DefaultMutableTreeNode nodeToRender = (DefaultMutableTreeNode)(value);
		Object nodeObject = nodeToRender.getUserObject();
		
		if (nodeObject instanceof UserObjectWrapper) {
			UserObjectWrapper data = (UserObjectWrapper)nodeObject;
			setText(data.getDisplayName());
		}
		if(!((DefaultMutableTreeNode)value).isRoot())
		{
		this.setIcon(m_node);
		}
		else
		{
		this.setIcon(m_root);
		}
		return this;
	}
}