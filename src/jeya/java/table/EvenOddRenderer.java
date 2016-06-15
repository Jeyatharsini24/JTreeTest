package jeya.java.table;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class EvenOddRenderer implements TableCellRenderer {
	  public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
		        table, value, isSelected, hasFocus, row, column);
		    ((JLabel) renderer).setOpaque(true);
		    Color foreground = Color.black;
		    Color background = Color.WHITE;
		    if (!isSelected) {
		    	if (row % 2 == 1) {
		    		foreground = Color.WHITE;
		    		background = new Color(110,191,82);
				    renderer.setForeground(foreground);
				    renderer.setBackground(background);
			      } 
			     else {
			         foreground = new Color(110,191,82);
			    	 background = Color.WHITE;
					 renderer.setBackground(background);
					 renderer.setForeground(foreground);
			     }
		    } 
		    else {
		    	foreground = Color.WHITE;
			    background = new Color(247,122,46);
			    renderer.setBackground(background);
				renderer.setForeground(foreground);
		    }
		    return renderer;
	}
}