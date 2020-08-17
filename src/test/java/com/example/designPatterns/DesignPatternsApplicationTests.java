package com.example.designPatterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.designPatterns.singleton.extend.service.ExtendMinister;
import com.example.designPatterns.singleton.lazy.service.LazyMinister;
import com.example.designPatterns.singleton.service.Minister;

@SpringBootTest
class DesignPatternsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void singletonTest() {
		Minister minister = new Minister();
		minister.meeting();
		
	}
	
	@Test
	void lazySingletonTest() {
		LazyMinister lazyMinister = new LazyMinister();
		lazyMinister.meeting();
		
	}
	
	@Test
	void extendSingleTest() {
		ExtendMinister extendMinister = new ExtendMinister();
		extendMinister.meeting();
		
	}

}
