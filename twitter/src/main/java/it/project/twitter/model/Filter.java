package it.project.twitter.model;

import java.util.ArrayList;

public class Filter {
	
	private String operator = ""; //Operatore inserito
	private String field = ""; //Campo inserito 
	private ArrayList<String> values = new ArrayList<String>();
	
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public ArrayList<String> getValues() {
		return values;
	}
	public void setValues(ArrayList<String> values) {
		this.values = values;
	}


}
