package it.project.twitter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.project.twitter.service.TweetService;

@RestController
public class ControllerClass {
	
	@Autowired
	private TweetService tweetservice;
	
	@RequestMapping(value="/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadatas() {
		return new ResponseEntity<>(tweetservice.getMetada(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/tweet", method = RequestMethod.GET)
	public ResponseEntity<Object> getTweets() {
		return new ResponseEntity<>(tweetservice.getTweet(), HttpStatus.OK);
		}
	
	@RequestMapping(value="/tweet", method = RequestMethod.POST)
	public ResponseEntity<Object> getFilteredTweets(@RequestBody Object JsonFilter) {
		return new ResponseEntity<>();
		}
	
	
	
	
	

}
