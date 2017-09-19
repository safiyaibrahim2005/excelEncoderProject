package com.excelEncoderProject.model;

public class excelLoad {
int id;

String incident;
String Title;

String Status;
String Urgency;
String Priority;

String AG;
String Assignee;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIncident() {
	return incident;
}
public void setIncident(String incident) {
	this.incident = incident;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}

public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getUrgency() {
	return Urgency;
}
public void setUrgency(String urgency) {
	Urgency = urgency;
}
public String getPriority() {
	return Priority;
}
public void setPriority(String priority) {
	Priority = priority;
}

public String getAG() {
	return AG;
}
public void setAG(String aG) {
	AG = aG;
}
public String getAssignee() {
	return Assignee;
}
public void setAssignee(String assignee) {
	Assignee = assignee;
}


}
