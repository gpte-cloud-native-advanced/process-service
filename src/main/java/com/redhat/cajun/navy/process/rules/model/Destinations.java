package com.redhat.cajun.navy.process.rules.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Destinations implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final List<Destination> destinations;

	public Destinations() {
		destinations = new ArrayList<>();
	}

	public Destinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	public List<Destination> getDestinations() {
		return destinations;
	}

	public void add(Destination destination) {
		destinations.add(destination);
	}
	
	@Override
	public String toString() {
		return "Destinations [destinations=" + destinations + "]";
	}
}
