package it.project.twitter.util.extra;

import java.util.ArrayList;

public class ArrayStringFilter {

	protected ArrayList<String> param = new ArrayList<String>();

	

	public void FilterArrayString(Object params) {
		
		if(params instanceof ArrayList<?>) {
			
			for(Object ele : (ArrayList<?>)params) {
				
				if(ele instanceof String) {
					param.add((String)ele);
				}else {
					throw new IllegalArgumentException("Type: String ");
				}
			}

		}else {			
			throw new IllegalArgumentException("Type: Array ");
		}
	}
	
	
	
	public void SetFilterParameters(Object params) {
		
		
		if(params instanceof ArrayList<?>) {
			
			for(Object ele : (ArrayList<?>)params) {
				
				if(ele instanceof String) {
					param.add((String)ele);
				}else {
					throw new IllegalArgumentException("Type: String ");
				}
			}

		}else {			
			throw new IllegalArgumentException("Type: Array ");
		}
	}
}
