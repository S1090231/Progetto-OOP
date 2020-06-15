package it.project.twitter.service;

import java.util.ArrayList;

import it.project.twitter.model.Metadata;

public class MetadataArray {

	private static ArrayList<Metadata> metadata = new ArrayList<Metadata>();
	
	public static ArrayList<Metadata> getArrayMetadata() {
		
		metadata.add(new Metadata("id","id tweet","Long"));
		metadata.add(new Metadata("dataCreation", "data e ora tweet", "String"));
		metadata.add(new Metadata("text","testo,tweet","String"));
		metadata.add(new Metadata("text","testo dell'hashtag","String"));
		metadata.add(new Metadata("userMentions","account menzionati nel tweet","ArrayList"));
		metadata.add(new Metadata("lang","lingua del tweet","String"));
		metadata.add(new Metadata("idAuthor","id dell'utente che ha tweettato","Long"));
		return metadata;
	}
}
