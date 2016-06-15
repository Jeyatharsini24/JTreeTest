package jeya.java.tree;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import jeya.java.table.TablePanel;

public class TreePanel extends JPanel {
	JTree tree;
	JeyaTreeSelectionListener jeyaTreeSelectionListener;
	public TreePanel()
	{
		tree = new JTree();
		tree.setCellRenderer(new TreeNodeRenderer());
		this.setLayout(new GridBagLayout());
		tree.setBackground(new Color(251,237,202));
		GridBagConstraints gbc_tree = new GridBagConstraints();
		gbc_tree.fill = GridBagConstraints.BOTH;
		gbc_tree.anchor = GridBagConstraints.LINE_START;
		gbc_tree.weighty = 1.0;
		gbc_tree.weightx = 1.0;
		gbc_tree.gridy = 0;
		gbc_tree.gridx = 0;
		this.add(tree, gbc_tree);
		
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
			String selectedID = "Clicked";
			setChanged();
			notifyObservers(selectedID);
		}
	}

	public void addTreeSelectionChangeListeners(JPanel tablePanel) {
		jeyaTreeSelectionListener.addObserver((Observer) tablePanel);
	}
}
