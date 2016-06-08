package jeya.java.tree;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;

/**
 * 
 * @author JJeyatharsini
 * This class is used to exhibit the JTree and its changes
 */
public class TreeFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4551625864133973022L;
	JTree tree;
	JPanel panel;
	TreeFrame()
	{
		super("JTreeExample");
		ImageIcon frameIcon = new IconProvider().getIcon(IconProvider.TREE_TREE);
		setIconImage(frameIcon.getImage());
		setLayout(new GridLayout(1,1));
		tree = new JTree();
		tree.setCellRenderer(new TreeNodeRenderer());
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));
		getContentPane().add(panel);
		panel.add(tree);
		
		tree.setModel(TreeModel.getInstance());
		TreeModel.getInstance().loadData();
	}
}
