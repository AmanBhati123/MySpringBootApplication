package com.business.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.business.repositories.UserRepository;

@SpringBootTest
public class UserServiceTest {
@Autowired
public UserRepository userRepo;
@Disabled
	@Test
	//@CsvFileSource
    //@ParameterizedTest
	public void testUser()
	{
		assertNotNull(userRepo.findById(1));
        assertEquals(2, 1+3);
	}
	
	
	
	
	
	
}
