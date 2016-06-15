package jeya.java.tree;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jeya.java.model.EditorPanel;
import jeya.java.table.TablePanel;

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
	TreePanel treePanel;
	TablePanel tablePanel;
	EditorPanel editorPanel;
	JPanel mainPanel;

	TreeFrame()
	{
		super("JTreeExample");
		ImageIcon frameIcon = new IconProvider().getIcon(IconProvider.TREE_TREE);
		setIconImage(frameIcon.getImage());
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gbc_mainPanel = new GridBagConstraints();
		gbc_mainPanel.fill = GridBagConstraints.BOTH;
		gbc_mainPanel.weighty = 1.0;
		gbc_mainPanel.weightx = 1.0;
		gbc_mainPanel.gridy = 0;
		gbc_mainPanel.gridx = 0;
		getContentPane().add(mainPanel, gbc_mainPanel);
		
		tablePanel = new TablePanel();
		GridBagConstraints gbc_tablePanel = new GridBagConstraints();
		gbc_tablePanel.gridheight = 3;
		gbc_tablePanel.fill = GridBagConstraints.BOTH;
		gbc_tablePanel.weighty = 6.0;
		gbc_tablePanel.weightx = 4.0;
		gbc_tablePanel.gridy = 0;
		gbc_tablePanel.gridx = 4;
		mainPanel.add(tablePanel, gbc_tablePanel);
		
		treePanel = new TreePanel();
		GridBagConstraints gbc_treePanel = new GridBagConstraints();
		gbc_treePanel.anchor = GridBagConstraints.LINE_START;
		gbc_treePanel.gridheight = 6;
		gbc_treePanel.gridwidth = 4;
		gbc_treePanel.weighty = 1.0;
		gbc_treePanel.weightx = 2.0;
		gbc_treePanel.fill = GridBagConstraints.BOTH;
		gbc_treePanel.gridy = 0;
		gbc_treePanel.gridx = 0;
		mainPanel.add(treePanel, gbc_treePanel);
		
		treePanel.addTreeSelectionChangeListeners(tablePanel);
		
		editorPanel = new EditorPanel();
		GridBagConstraints gbc_editorPanel = new GridBagConstraints();
		gbc_editorPanel.fill = GridBagConstraints.BOTH;
		gbc_editorPanel.gridheight = 3;
		gbc_editorPanel.weighty = 5.0;
		gbc_editorPanel.weightx = 4.0;
		gbc_editorPanel.gridy = 3;
		gbc_editorPanel.gridx = 4;
		mainPanel.add(editorPanel, gbc_editorPanel);
	}
}
