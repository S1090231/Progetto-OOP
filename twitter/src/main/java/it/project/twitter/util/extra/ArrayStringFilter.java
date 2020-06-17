package it.project.twitter.util.extra;

import java.util.ArrayList;

public class ArrayStringFilter {

	protected ArrayList<String> param = new ArrayList<String>();

	
	/** Costruttore 
	 * @param parameters deve essere un ArrayList String.
	 * @return 
	 * @throws IllegalArgumentException il valore inserito non è del tipo richiesto
	*/
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
	
	
	/** Set 
	 * @param parameters deve essere un ArrayList di stringhe
	 * @throws IllegalArgumentException il valore inserito non è del tipo richiesto 
	*/
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
