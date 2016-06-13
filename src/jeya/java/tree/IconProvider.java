package jeya.java.tree;

import javax.swing.ImageIcon;

public class IconProvider {
	public static final String TREE_TREE = "TREE.TREE.png";
	public static final String TREE_ROOT = "TREE.ROOT.png";
	public static final String TREE_NODE = "TREE.NODE.png";
	public static final String TREE_LEAF = "TREE.LEAF.png";

	public ImageIcon getIcon(String iconName)
	{
		String path = "/img/";
		ImageIcon icon = createImageIcon(path + iconName,
	            "a pretty but meaningless splat");
		return icon;
	}
	
	protected ImageIcon createImageIcon(String path,
			String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}
