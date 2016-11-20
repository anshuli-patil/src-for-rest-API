package com.hackathon1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class InfoDao {
	public List<Info> getAllInfo() {
		List<Info> userList = new ArrayList<Info>();
		try (BufferedReader br = new BufferedReader(new FileReader("Hackathon-Data-csv.txt"))) {
			for (String line; (line = br.readLine()) != null;) {
				userList.add(new Info(line));
			}
			// line is not visible here.
		} catch (Exception e) {

		}
		return userList;
	}
}
