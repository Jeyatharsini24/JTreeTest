package jeya.java.listener;

import java.beans.PropertyChangeSupport;

// used to have observer <-> observable by way communication
// A should change when B changes, B should change when A changes
public class RowPropertyChangeListener {
	private static RowPropertyChangeListener instance;
	
	// provided by Java to support binding feature
	private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	
	private RowPropertyChangeListener()
	{
		
	}
	
	public RowPropertyChangeListener getInstance()
	{
		if(instance == null)
		{
			instance = new RowPropertyChangeListener();
		}
		return instance;
	}
}
