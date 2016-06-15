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
		    /*Color foreground = Color.black;
		    Color background = Color.WHITE;*/
		    if (!isSelected) {
		    	if (row % 2 == 1) {
		    		//Color foreground = Color.black;
		    		Color background = new Color(251,251,243);
				    //renderer.setForeground(foreground);
				    renderer.setBackground(background);
			      } 
			     else {
			        //Color foreground = Color.black;
			    	 Color background = new Color(252,252,252);
					 renderer.setBackground(background);
			      }
		    } 
		    /*else {
		    	foreground = Color.yellow;
			    background = Color.green;
		    }*/
		    return renderer;
	}
}