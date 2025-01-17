package com.ana.spring_com_api_rest;

import java.util.List;


public class User {
	
	 private String name;
	    private Account account;
	    private List<Feature> features;
	    private Card card;
	    private List<News> news;

	    // Getters and Setters
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public Account getAccount() { return account; }
	    public void setAccount(Account account) { this.account = account; }

	    public List<Feature> getFeatures() { return features; }
	    public void setFeatures(List<Feature> features) { this.features = features; }

	    public Card getCard() { return card; }
	    public void setCard(Card card) { this.card = card; }

	    public List<News> getNews() { return news; }
	    public void setNews(List<News> news) { this.news = news; }

}
