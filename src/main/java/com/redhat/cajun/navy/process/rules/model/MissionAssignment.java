package com.redhat.cajun.navy.process.rules.model;

import java.io.Serializable;

public class MissionAssignment implements Serializable {

    private static final long serialVersionUID = 1L;
    private int compatibilityScore = 0;
    private final Incident incident;
    private final Responder responder;
    private double distance;

    public MissionAssignment( Incident incident, Responder responder ) {
        this.incident = incident;
        this.responder = responder;
        this.compatibilityScore = 0;
        this.distance = 99999999;
    }
    
    public MissionAssignment( Incident incident, Responder responder, double distance ) {
        this.incident = incident;
        this.responder = responder;
        this.compatibilityScore = 0;
        this.distance = distance;
    }

    public int getCompatibilityScore() {
        return compatibilityScore;
    }

    public void setCompatibilityScore( int compatibilityScore ) {
        this.compatibilityScore = compatibilityScore;
    }

    public Incident getIncident() {
        return incident;
    }

    public Responder getResponder() {
        return responder;
    }

    public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Long getReportedTime() {
        if ( !( incident == null ) ) {
            return this.incident.getReportedTime();
        } else {
            return null;
        }
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + compatibilityScore;
		long temp;
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((incident == null) ? 0 : incident.hashCode());
		result = prime * result + ((responder == null) ? 0 : responder.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MissionAssignment other = (MissionAssignment) obj;
		if (compatibilityScore != other.compatibilityScore)
			return false;
		if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
			return false;
		if (incident == null) {
			if (other.incident != null)
				return false;
		} else if (!incident.equals(other.incident))
			return false;
		if (responder == null) {
			if (other.responder != null)
				return false;
		} else if (!responder.equals(other.responder))
			return false;
		return true;
	}

    @Override
	public String toString() {
		return "MissionAssignment [compatibilityScore=" + compatibilityScore + ", incident=" + incident + ", responder="
				+ responder + ", distance=" + distance + "]";
	}

}