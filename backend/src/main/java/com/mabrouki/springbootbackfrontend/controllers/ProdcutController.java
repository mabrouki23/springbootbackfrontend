package com.mabrouki.springbootbackfrontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mabrouki.springbootbackfrontend.services.ProductServiceImpl;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProdcutController {
	
	private final ProductServiceImpl productServiceImpl;

}
