package com.ana.spring_com_api_rest;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
	
	 @GetMapping("/users")
	    public List<User> getUsers() {
	        
	        List<User> users = new ArrayList<>();

	        User user = new User();
	        user.setName("Analice S");

	        // Account
	        Account account = new Account();
	        account.setNumber("12345");
	        account.setAgency("6789");
	        account.setBalance(1000.0);
	        account.setLimit(5000.0);
	        user.setAccount(account);

	        // Features
	        Feature feature1 = new Feature();
	        feature1.setIcon("feature1-icon");
	        feature1.setDescription("Feature 1 description");
	        Feature feature2 = new Feature();
	        feature2.setIcon("feature2-icon");
	        feature2.setDescription("Feature 2 description");
	        user.setFeatures(List.of(feature1, feature2));

	        // Card
	        Card card = new Card();
	        card.setNumber("1111222233334455");
	        card.setLimit(9000.0);
	        user.setCard(card);

	        // News
	        News news1 = new News();
	        news1.setIcon("news-icon1");
	        news1.setDescription("News description 1");
	        News news2 = new News();
	        news2.setIcon("news-icon2");
	        news2.setDescription("News description 2");
	        user.setNews(List.of(news1, news2));

	        users.add(user);
	        return users;
	    }
	}
	


