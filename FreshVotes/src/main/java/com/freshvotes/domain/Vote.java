package com.freshvotes.domain;

import javax.persistence.Entity;
import javax.persistence.EmbeddedId;

@Entity


public class Vote {
	
	
	private VoteId pk;
	
	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}

	public void setPk(VoteId pk) {
		this.pk = pk;
	}

	private Boolean upvote;

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	

}
