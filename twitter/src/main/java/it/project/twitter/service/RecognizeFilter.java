package it.project.twitter.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.project.twitter.exception.FilterIllegalArgumentException;
import it.project.twitter.exception.FilterNotFoundException;
import it.project.twitter.exception.InternalGeneralException;
import it.project.twitter.util.extra.Filter;
import it.project.twitter.model.Tweet;

public class RecognizeFilter {
	public static ArrayList<Tweet> JsonParserColumn(Object filter)
			throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException 
			{ 
		ArrayList<Tweet> previousArray= new ArrayList<Tweet>();
		ArrayList<Tweet> filteredArray= new ArrayList<Tweet>();
		HashMap<String,Object> result= new ObjectMapper().convertValue(filter, HashMap.class);
	
		for(Map.Entry<String, Object> entry: result.entrySet()) {
	
			filteredArray= new ArrayList<Tweet>();
			String column=entry.getKey();
			Object filterParam=entry.getValue();
			try {
					filteredArray=jsonParserOperator(column, filterParam, previousArray);
			}catch (SecurityException e) {
				throw new InternalGeneralException ("Error in I/O parsing information");
			}
	
			previousArray=new ArrayList<Tweet>();
			previousArray.addAll(filteredArray);
		}
		return filteredArray;
	 }

	private static ArrayList<Tweet> jsonParserOperator(String column, Object filterParam,
			ArrayList<Tweet> previousArray) throws FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException {
		
		String type="";
		Filter filter;
		ArrayList<Tweet> filteredArray= new ArrayList <Tweet>();
		HashMap<String, Object> result= new ObjectMapper().convertValue(filterParam,HashMap.class);
		
		for(Map.Entry<String, Object> entry: result.entrySet()) {
			String operator= entry.getKey();
			Object value=entry.getValue();
		 
			if(operator.equals("type") || operator.equals("Type")) {
				if(operator.equals("type")) {

					throw new FilterIllegalArgumentException(" Type must be 'T' caps ");

				}
				type=(String) value;
				if(!(value.equals("and"))&&!(value.equals("or"))) {
					throw new FilterIllegalArgumentException("'and' o 'or' expected after 'type'");
		    	}
		    	continue;
		    } 
			filter= FilterService.instanceFilter(column, operator, value);
			if (type.equals("and"))
				filteredArray = FilterService.runFilterAND(filter, previousArray);
			else 
				filteredArray = FilterService.runFilterOR(filter, previousArray);
		}
		return filteredArray;
	
	}
}

