package jeya.java.data;

/**
 * 
 * @author JJeyatharsini
 * This class is the actual user object which is going to be shown using tree
 */
public class UserObject {
	private String id; 
	private String displayName;
	private String arg3;
	public UserObject(String id, String displayName, String arg3)
	{
		this.id = id;
		this.displayName = displayName;
		this.arg3 = arg3;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getArg3() {
		return arg3;
	}
	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}
}
