package com.app.service.impl;

import org.springframework.stereotype.Service;

import com.app.exception.NoBookFoundException;
import com.app.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Double findPriceById(String bookId) {

		if(bookId.equals("101"))
		{
			return 450.00;
		}else
		{
			throw new NoBookFoundException("No Boook Found given Id");
		}
	}

}
