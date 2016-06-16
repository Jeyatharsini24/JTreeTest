package jeya.java.tree;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import jeya.java.data.UserObject;

public class TreePanel extends JPanel {
	JTree tree;
	JeyaTreeSelectionListener jeyaTreeSelectionListener;
	public TreePanel()
	{
		JScrollPane scrollPane = new JScrollPane();
		tree = new JTree();
		tree.setCellRenderer(new TreeNodeRenderer());
		this.setLayout(new GridBagLayout());
		tree.setBackground(new Color(251,237,202));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.anchor = GridBagConstraints.LINE_START;
		gbc_scrollPane.weighty = 1.0;
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.gridy = 0;
		gbc_scrollPane.gridx = 0;
		this.add(scrollPane, gbc_scrollPane);
		scrollPane.setViewportView(tree);
		
		tree.setModel(TreeModel.getInstance());
		TreeModel.getInstance().loadData();
		
		jeyaTreeSelectionListener = new JeyaTreeSelectionListener();
		tree.addTreeSelectionListener(jeyaTreeSelectionListener);
		
		TitledBorder title1;
		Border raisedbevel1;
		raisedbevel1 = BorderFactory.createRaisedBevelBorder();
		title1 = BorderFactory.createTitledBorder(raisedbevel1, "");
		title1.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		
		tree.setBorder(title1);
	}
	
	class JeyaTreeSelectionListener extends Observable implements TreeSelectionListener
	{
		@Override
		public void valueChanged(TreeSelectionEvent paramTreeSelectionEvent) {
	        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			if(!selectedNode.isRoot())
			{
				UserObjectWrapper userObjectWrapper = (UserObjectWrapper) selectedNode.getUserObject();
				UserObject userObject = userObjectWrapper.getUserObject();
				String selectedID = userObject.getId();
				setChanged();
				notifyObservers(selectedID);	
			}
		}
	}

	public void addTreeSelectionChangeListeners(Observer tablePanel) {
		jeyaTreeSelectionListener.addObserver(tablePanel);
	}
}
