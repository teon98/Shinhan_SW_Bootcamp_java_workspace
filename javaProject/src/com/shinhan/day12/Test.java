package com.shinhan.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		HashMap<String, String> location = new HashMap<String, String>();
		location.put("home", "Daejeon");
		location.put("office", "Seoul");
		
		for(  String key : location.keySet()) {
		    System.out.println(key + "=>" + location.get(key));

		}
	}
}

