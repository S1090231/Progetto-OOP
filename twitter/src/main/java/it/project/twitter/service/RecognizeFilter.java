package it.project.twitter.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.project.twitter.exception.FilterIllegalArgumentException;
import it.project.twitter.exception.FilterNotFoundException;
import it.project.twitter.exception.InternalGeneralException;
import it.project.twitter.model.Filter;
import it.project.twitter.model.Tweet;
import it.project.twitter.model.UserMention;

public class RecognizeFilter {
	public static ArrayList<Tweet> JsonParserColumn(Object filter, UserMention mention)
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
							filteredArray=jsonParserOperator(column, filterParam, previousArray, mention);
					}catch (SecurityException e) {
						throw new InternalGeneralException ("Error in I/O parsing information");
					}
					
					previousArray=new ArrayList<Tweet>();
					previousArray.addAll(filteredArray);
				}
				return filteredArray;
				
}

	private static ArrayList<Tweet> jsonParserOperator(String column, Object filterParam,
			ArrayList<Tweet> previousArray, UserMention mention) {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	}
