package jeya.java.tree;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jeya.java.model.ButtonsPanel;
import jeya.java.model.EditorPanel;
import jeya.java.model.NewButtonPanel;
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
	NewButtonPanel newButtonPanel;
	ButtonsPanel buttonsPanel;
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
		gbc_tablePanel.anchor = GridBagConstraints.EAST;
		gbc_tablePanel.gridwidth = 4;
		gbc_tablePanel.fill = GridBagConstraints.BOTH;
		gbc_tablePanel.gridheight = 9;
		gbc_tablePanel.weighty = 9.0;
		gbc_tablePanel.weightx = 4.0;
		gbc_tablePanel.gridy = 0;
		gbc_tablePanel.gridx = 5;
		mainPanel.add(tablePanel, gbc_tablePanel);
		
		treePanel = new TreePanel();
		GridBagConstraints gbc_treePanel = new GridBagConstraints();
		gbc_treePanel.anchor = GridBagConstraints.LINE_START;
		gbc_treePanel.gridheight = 13;
		gbc_treePanel.gridwidth = 5;
		gbc_treePanel.weighty = 9.0;
		gbc_treePanel.weightx = 5.0;
		gbc_treePanel.fill = GridBagConstraints.BOTH;
		gbc_treePanel.gridy = 0;
		gbc_treePanel.gridx = 0;
		mainPanel.add(treePanel, gbc_treePanel);
		
		treePanel.addTreeSelectionChangeListeners(tablePanel);
		
		editorPanel = new EditorPanel();
		GridBagConstraints gbc_editorPanel = new GridBagConstraints();
		gbc_editorPanel.gridwidth = 4;
		gbc_editorPanel.anchor = GridBagConstraints.EAST;
		gbc_editorPanel.fill = GridBagConstraints.BOTH;
		gbc_editorPanel.gridheight = 2;
		gbc_editorPanel.weighty = 2.0;
		gbc_editorPanel.weightx = 4.0;
		gbc_editorPanel.gridy = 10;
		gbc_editorPanel.gridx = 5;
		mainPanel.add(editorPanel, gbc_editorPanel);
		
		buttonsPanel = new ButtonsPanel();
		GridBagConstraints gbc_buttonsPanel = new GridBagConstraints();
		gbc_buttonsPanel.gridwidth = 4;
		gbc_buttonsPanel.anchor = GridBagConstraints.EAST;
		gbc_buttonsPanel.fill = GridBagConstraints.BOTH;
		gbc_buttonsPanel.gridheight = 1;
		gbc_buttonsPanel.weighty = 1.0;
		gbc_buttonsPanel.weightx = 4.0;
		gbc_buttonsPanel.gridy = 12;
		gbc_buttonsPanel.gridx = 5;
		mainPanel.add(buttonsPanel, gbc_buttonsPanel);
		
		tablePanel.addTableRowSelectionListener(editorPanel);
		
		newButtonPanel = new NewButtonPanel();
		GridBagConstraints gbc_newButtonPanel = new GridBagConstraints();
		gbc_newButtonPanel.gridwidth = 4;
		gbc_newButtonPanel.anchor = GridBagConstraints.WEST;
		gbc_newButtonPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_newButtonPanel.weighty = 2.0;
		gbc_newButtonPanel.weightx = 4.0;
		gbc_newButtonPanel.gridy = 9;
		gbc_newButtonPanel.gridx = 5;
		mainPanel.add(newButtonPanel,gbc_newButtonPanel);
		
		newButtonPanel.addNewButtonClickListener(editorPanel);
		newButtonPanel.addNewButtonClickListener(buttonsPanel);
		treePanel.addTreeSelectionChangeListeners(buttonsPanel);
	}
}
