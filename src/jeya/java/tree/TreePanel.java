package jeya.java.tree;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class TreePanel extends JPanel {
	JTree tree;
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
		
		tree.addTreeSelectionListener(new TreeSelectionListener(){

			@Override
			public void valueChanged(TreeSelectionEvent arg0) {
				System.out.println("Miyaav");
			}});
		
		TitledBorder title1;
		Border raisedbevel1;
		raisedbevel1 = BorderFactory.createRaisedBevelBorder();
		title1 = BorderFactory.createTitledBorder(raisedbevel1, "");
		title1.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		
		tree.setBorder(title1);
	}
}
