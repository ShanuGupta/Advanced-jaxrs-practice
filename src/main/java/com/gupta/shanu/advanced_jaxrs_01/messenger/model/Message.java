package com.gupta.shanu.advanced_jaxrs_01.messenger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {
	private long id;
	private String message;
	private String author;
	private Date created;
	private Map<Long,Comment> comments;
	private List<Link> links;
	public Message(){
	
	}
	public Message(long id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
		this.comments = new HashMap<Long,Comment>();
		this.links = new ArrayList<Link>();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@XmlTransient
	public Map<Long,Comment> getComments() {
		return comments;
	}
	public void setComments(Map<Long,Comment> comments) {
		this.comments = comments;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public void addLink(String link, String rel){
		Link l = new Link(link,rel);
		links.add(l);
	}
}
