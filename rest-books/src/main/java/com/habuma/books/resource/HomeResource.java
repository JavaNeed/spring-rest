package com.habuma.books.resource;

import org.springframework.hateoas.ResourceSupport;

public class HomeResource extends ResourceSupport {
	
	public String getDescription() {
		return "The REST Books API";
	}
	
}
