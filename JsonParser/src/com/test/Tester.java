package com.test;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.model.User;
import com.parser.JsonParserClass;

public class Tester implements AutoCloseable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String jsonString = (new Scanner(System.in)).nextLine();
			User user = (User) new JsonParserClass().parseJsonToObject(jsonString, User.class);
			System.out.println(user.getData().getFull_name());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
