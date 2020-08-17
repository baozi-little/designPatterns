package com.example.designPatterns.factory.service;

public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> c);
	
}
