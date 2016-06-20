package jeya.java.model;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

import jeya.java.data.Entity;

public class ButtonsPanel extends JPanel implements Observer{
	private JButton btnDisableEdit;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnClose;
	public ButtonsPanel()
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		setBackground(new Color(153, 51, 0));
		
		btnDisableEdit = new JButton("Disable Edit");
		btnDisableEdit.setBackground(new Color(255, 255, 204));
		GridBagConstraints gbc_btnDisableEdit = new GridBagConstraints();
		gbc_btnDisableEdit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDisableEdit.insets = new Insets(0, 0, 5, 5);
		gbc_btnDisableEdit.anchor = GridBagConstraints.WEST;
		gbc_btnDisableEdit.gridx = 0;
		gbc_btnDisableEdit.gridy = 0;
		add(btnDisableEdit, gbc_btnDisableEdit);
		
		btnSave = new JButton("Save");
		btnSave.setBackground(new Color(255, 255, 204));
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSave.insets = new Insets(0, 0, 5, 5);
		gbc_btnSave.anchor = GridBagConstraints.WEST;
		gbc_btnSave.gridx = 1;
		gbc_btnSave.gridy = 0;
		add(btnSave, gbc_btnSave);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(255, 255, 204));
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelete.anchor = GridBagConstraints.WEST;
		gbc_btnDelete.gridx = 2;
		gbc_btnDelete.gridy = 0;
		add(btnDelete, gbc_btnDelete);
		
		btnClose = new JButton("Cancel");
		btnClose.setBackground(new Color(255, 255, 204));
		GridBagConstraints gbc_btnClose = new GridBagConstraints();
		gbc_btnClose.insets = new Insets(0, 0, 5, 0);
		gbc_btnClose.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClose.gridx = 3;
		gbc_btnClose.gridy = 0;
		add(btnClose, gbc_btnClose);
	}
	@Override
	public void update(Observable paramObservable, Object paramObject) {
		try
		{
			Entity entity = (Entity)paramObject;
			if(entity == null) // from new button select
			{
				btnSave.setEnabled(true);
				btnDisableEdit.setEnabled(true);
				btnDelete.setEnabled(false);
			}
		}
		catch(Exception e)
		{
			// from tree panel
			btnSave.setEnabled(false);
			btnDisableEdit.setEnabled(false);
			btnDelete.setEnabled(false);
		}
	}
}
