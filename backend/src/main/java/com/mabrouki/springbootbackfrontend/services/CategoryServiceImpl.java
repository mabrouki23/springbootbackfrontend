package com.mabrouki.springbootbackfrontend.services;

import org.springframework.stereotype.Service;

import com.mabrouki.springbootbackfrontend.repositories.CategoryRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryServiceInterface{
	
	private final CategoryRepository categoryRepository;
	

}
