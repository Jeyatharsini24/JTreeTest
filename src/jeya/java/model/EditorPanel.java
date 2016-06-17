package jeya.java.model;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import jeya.java.data.Entity;

public class EditorPanel extends JPanel implements Observer{
	JLabel userObjectIDLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblArg_2;
	private JTextField textField_2;
	private JLabel lblEditable;
	private JButton btnDisableEdit;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnClose;
	private JComboBox comboBox;
	public EditorPanel()
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		setBackground(new Color(229,156,59));
		
		TitledBorder title1;
		Border raisedbevel1;
		raisedbevel1 = BorderFactory.createRaisedBevelBorder();
		title1 = BorderFactory.createTitledBorder(raisedbevel1, "");
		title1.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		this.setBorder(title1);
		
		userObjectIDLabel = new JLabel("UserObjectID");
		GridBagConstraints gbc_userObjectIDLabel = new GridBagConstraints();
		gbc_userObjectIDLabel.insets = new Insets(0, 0, 5, 5);
		gbc_userObjectIDLabel.anchor = GridBagConstraints.WEST;
		gbc_userObjectIDLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_userObjectIDLabel.weighty = 1.0;
		gbc_userObjectIDLabel.weightx = 1.0;
		gbc_userObjectIDLabel.gridy = 0;
		gbc_userObjectIDLabel.gridx = 0;
		add(userObjectIDLabel, gbc_userObjectIDLabel);
		
		comboBox = new JComboBox(new String[]{"1.0.1","1.0.1.1","1.0.1.2",
				"1.0.2","1.0.2.1","1.0.2.2",
				"1.0.3","1.0.3.1","1.0.3.2",
				"1.0.4","1.0.4.1","1.0.4.2",
				"1.0.5","1.0.5.1","1.0.5.2",
				"1.0.6","1.0.6.1","1.0.6.2"
				});
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		add(comboBox, gbc_comboBox);
		
		JLabel lblArg = new JLabel("Arg1");
		GridBagConstraints gbc_lblArg = new GridBagConstraints();
		gbc_lblArg.insets = new Insets(0, 0, 5, 5);
		gbc_lblArg.anchor = GridBagConstraints.WEST;
		gbc_lblArg.weighty = 1.0;
		gbc_lblArg.weightx = 1.0;
		gbc_lblArg.gridx = 0;
		gbc_lblArg.gridy = 1;
		add(lblArg, gbc_lblArg);
		
		lblArg_2 = new JLabel("Arg3");
		GridBagConstraints gbc_lblArg_2 = new GridBagConstraints();
		gbc_lblArg_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblArg_2.weighty = 1.0;
		gbc_lblArg_2.weightx = 1.0;
		gbc_lblArg_2.anchor = GridBagConstraints.WEST;
		gbc_lblArg_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArg_2.gridx = 0;
		gbc_lblArg_2.gridy = 3;
		add(lblArg_2, gbc_lblArg_2);
		
		JLabel lblArg_1 = new JLabel("Arg2");
		GridBagConstraints gbc_lblArg_1 = new GridBagConstraints();
		gbc_lblArg_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblArg_1.weighty = 1.0;
		gbc_lblArg_1.weightx = 1.0;
		gbc_lblArg_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArg_1.anchor = GridBagConstraints.EAST;
		gbc_lblArg_1.gridx = 0;
		gbc_lblArg_1.gridy = 2;
		add(lblArg_1, gbc_lblArg_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnDisableEdit = new JButton("Disable Edit");
		GridBagConstraints gbc_btnDisableEdit = new GridBagConstraints();
		gbc_btnDisableEdit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDisableEdit.insets = new Insets(0, 0, 5, 5);
		gbc_btnDisableEdit.anchor = GridBagConstraints.WEST;
		gbc_btnDisableEdit.gridx = 0;
		gbc_btnDisableEdit.gridy = 4;
		add(btnDisableEdit, gbc_btnDisableEdit);
		
		lblEditable = new JLabel("Can Edit");
		GridBagConstraints gbc_lblEditable = new GridBagConstraints();
		gbc_lblEditable.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditable.weighty = 1.0;
		gbc_lblEditable.weightx = 1.0;
		gbc_lblEditable.gridx = 2;
		gbc_lblEditable.gridy = 4;
		add(lblEditable, gbc_lblEditable);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.anchor = GridBagConstraints.WEST;
		gbc_btnSave.gridx = 0;
		gbc_btnSave.gridy = 5;
		add(btnSave, gbc_btnSave);
		
		btnDelete = new JButton("Delete");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.insets = new Insets(0, 0, 0, 5);
		gbc_btnDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelete.anchor = GridBagConstraints.WEST;
		gbc_btnDelete.gridx = 1;
		gbc_btnDelete.gridy = 5;
		add(btnDelete, gbc_btnDelete);
		
		btnClose = new JButton("Cancel");
		GridBagConstraints gbc_btnClose = new GridBagConstraints();
		gbc_btnClose.insets = new Insets(0, 0, 0, 5);
		gbc_btnClose.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClose.gridx = 2;
		gbc_btnClose.gridy = 5;
		add(btnClose, gbc_btnClose);
	}
	
	@Override
	public void update(Observable paramObservable, Object paramObject) {
		Entity selectedEntity = (Entity)paramObject;
		loadWithData(selectedEntity);
	}

	private void loadWithData(Entity selectedEntity) {
		comboBox.setSelectedItem(selectedEntity.getUserObjectID());
		//To continue
	}
}
