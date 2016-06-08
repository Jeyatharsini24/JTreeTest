package jeya.java.tree;

/**
 * 
 * @author JJeyatharsini
 * This class is used to hold the actual user object. It is the class which is going to be
 * stored instead for actual user object. When getUserObject method is invoked object of
 * this class will be resulted. From that, we can get the actual user object. The reason
 * for using this class:
 * 1. Display name of the node in tree : toString() method of the object which is stored in
 * tree will be invoked internally.
 * 2. So virtual reference of the object will be shown in user interface.
 * 3. To avoid this we should override the toString() method in user object class.
 * 4. If override toString() method to return display name in user object class, 
 * getRoot() method will return the display name instead for reference. Problem.
 */
public class UserObjectWrapper {
	private UserObject userObject;
	private String displayName;
	
	public UserObject getUserObject() {
		return userObject;
	}

	public UserObjectWrapper(UserObject userObject) {
		super();
		this.userObject = userObject;
		this.displayName = userObject.getDisplayName();
	}



	public UserObjectWrapper(UserObject userObject, String displayName) {
		super();
		this.userObject = userObject;
		this.displayName = displayName;
	}

	public void setUserObject(UserObject userObject) {
		this.userObject = userObject;
	}



	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString()
	{
		return displayName;
	}
}
