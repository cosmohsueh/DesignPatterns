package com.cosmo.OM;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class EventDispatch implements Observer {

	private final static EventDispatch dispatch = new EventDispatch();

	private Vector<EventCustomer> customer = new Vector<EventCustomer>();

	private EventDispatch() {

	}

	public static EventDispatch getEventDispatch() {
		return dispatch;
	}

	@Override
	public void update(Observable o, Object arg) {
		Product p = (Product) arg;
		ProductEvent event = (ProductEvent) o;
		for (EventCustomer e : customer) {
			for (EventCustomeType type : e.getCustomType()) {
				if (type.getValue() == event.getType().getValue()) {
					e.exec(event);
				}
			}
		}
	}

	public void registerCustomer(EventCustomer customer) {
		this.customer.add(customer);
	}

}
