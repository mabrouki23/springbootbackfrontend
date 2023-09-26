package com.mabrouki.springbootbackfrontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mabrouki.springbootbackfrontend.services.CommandeServiceImpl;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class CommandeController {
	
	private final CommandeServiceImpl commdandeServiceImpl;
}
