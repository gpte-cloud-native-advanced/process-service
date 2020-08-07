package com.redhat.cajun.navy.process.rules.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Responders implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final List<Responder> responders;

	public Responders() {
		this.responders = new ArrayList<>();
	}

	public Responders(List<Responder> responders) {
		this.responders = responders;
	}

	public List<Responder> getResponders() {
		return responders;
	}

	public void add(Responder responder) {
		responders.add(responder);
	}
	
	@Override
	public String toString() {
		return "Responders [" + responders.size() + "]";
	}
}
