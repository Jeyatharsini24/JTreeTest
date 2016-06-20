package jeya.java.data;

public class Entity {
	private String arg1;
	private String arg2;
	private String arg3;
	private String userObjectID;
	private boolean disableEdit;
	
	public boolean isDisableEdit() {
		return disableEdit;
	}
	public void setDisableEdit(boolean disableEdit) {
		this.disableEdit = disableEdit;
	}
	public Entity() {
		super();
	}
	public Entity(String userObjectID,String arg1, String arg2, String arg3) {
		super();
		this.userObjectID = userObjectID;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
	}
	
	public String getUserObjectID() {
		return userObjectID;
	}
	public void setUserObjectID(String userObjectID) {
		this.userObjectID = userObjectID;
	}
	public String getArg1() {
		return arg1;
	}
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	public String getArg2() {
		return arg2;
	}
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	public String getArg3() {
		return arg3;
	}
	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}
}
