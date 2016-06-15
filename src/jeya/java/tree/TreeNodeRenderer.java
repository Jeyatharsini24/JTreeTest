package jeya.java.tree;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

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
	ImageIcon m_leaf;
	
	public TreeNodeRenderer()
	{
		m_root = new IconProvider().getIcon(IconProvider.TREE_ROOT);
		m_node = new IconProvider().getIcon(IconProvider.TREE_NODE);
		m_leaf = new IconProvider().getIcon(IconProvider.TREE_LEAF);
	}
	
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, 
			boolean expanded,
			boolean leaf, int row, boolean hasFocus) 
	{
		super.getTreeCellRendererComponent(tree, value, selected,expanded, leaf, row, hasFocus);
		
		DefaultMutableTreeNode nodeToRender = (DefaultMutableTreeNode)(value);
		Object nodeObject = nodeToRender.getUserObject();
		DefaultMutableTreeNode root = (DefaultMutableTreeNode)(tree.getModel().getRoot());
		
		if (nodeObject instanceof UserObjectWrapper) {
			UserObjectWrapper data = (UserObjectWrapper)nodeObject;
			setText(data.getDisplayName());
		}
		// if root
		if(((DefaultMutableTreeNode)value).isRoot())
		{
			this.setIcon(m_root);
			this.setForeground(new Color(132,113,68));
		}
		// if direct child to root
		else if(root.isNodeChild(nodeToRender))
		{
			this.setIcon(m_node);
			this.setForeground(new Color(147,191,79));
		}
		// neither root or direct child
		else
		{
			this.setIcon(m_leaf);
			this.setForeground(new Color(92,167,62));
		}
		this.setBackgroundSelectionColor(new Color(207,205,22));
		this.setBackgroundNonSelectionColor(new Color(235,219,35));
		this.setFont(new Font("TimesRoman", Font.BOLD, 15));
		return this;
	}
}
