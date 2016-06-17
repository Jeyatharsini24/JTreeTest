package jeya.java.listener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import jeya.java.data.Entity;

// used to have observer <-> observable by way communication
// A should change when B changes, B should change when A changes
// New button should be disabled when an entity is displayed in EditorPanel
// EditorPanel should let to create new Entity when new button is clicked
public class EditorPanel_NewButton_ChangeListener {
	private static EditorPanel_NewButton_ChangeListener instance;
	public String ChangingState; // to notify that a state has changed
	private Entity sessionEntity;// current entity
	private boolean newButtonState;// state of new button
	// provided by Java to support binding feature
	private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	
	private EditorPanel_NewButton_ChangeListener()
	{
		
	}
	
	public static EditorPanel_NewButton_ChangeListener getInstance()
	{
		if(instance == null)
		{
			instance = new EditorPanel_NewButton_ChangeListener();
		}
		return instance;
	}
	
	// register listeners who are interested in the changes 
	// of the property 'Changed'
	 public void addStateChangeListener(String trigger, PropertyChangeListener listener)
	 {
		  propertyChangeSupport.addPropertyChangeListener(trigger, listener);
	 }
	 
	 // inform to the listeners who are interested in the changes
	 // of the property 'Changed' by the change maker (Observable)
	  public void setStateChangeTrigger(String trigger)
	  {
		  // old value && new value
		  // update new value as old value
		  propertyChangeSupport.firePropertyChange("Changed", this.ChangingState, trigger);
		  this.ChangingState = trigger;
	  }
	  
	  public void setEntitySaveTriggerProperty(String trigger)
	  {
	    ChangingState = trigger;
	  }

	  public void setPanelSessionEntity(Entity note)
	  {
	    this.sessionEntity = note;
	  }

	  public Entity getPanelSessionEntity()
	  {
	    return sessionEntity;
	  }

	  public boolean isNewButtonEnable()
	  {
	    return newButtonState;
	  }

	  public void enableNewButtonState(boolean state)
	  {
	    newButtonState = state;
	  }
}
