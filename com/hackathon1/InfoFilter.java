package com.hackathon1;

import java.io.BufferedReader;
import java.io.FileReader;


public class InfoFilter {

	public String getResponseText(String type, String name) {
		// List<Info> info = new InfoDao().getAllInfo();
		return jsonFormat(type, name);
	}
	
	
	public static String jsonFormat(String userType, String userName) {

		String name = "VesselName	OperationTypeName	CargoType	Quantity	ShippingLine	Container#	BillOfLading#	ContainerSizeType LoadPort	UnloadPort	LocalOrIPI	InlandPoint	AgentVoyageNumber";

		StringBuilder sb = new StringBuilder();
		String[] name_split = name.split("	");
		try (BufferedReader br = new BufferedReader(new FileReader("Hackathon-Data-csv.txt"))) {

			for (String line; (line = br.readLine()) != null;) {
				boolean isAMatch = false;
				String this_line = ("{");
				
				String[] line_split = line.split(",");
				for (int i = 0; i < line_split.length - 1; i++) {
					if(userType.equals(name_split[i]) && userName.equals(line_split[i])) {
						isAMatch = true;
					}
					this_line += ("\"" + name_split[i] + "\":\"" + line_split[i] + "\",");
					i++;
				}
				this_line += ("}");
				
				if(isAMatch) {
					sb.append(this_line);
				}
			}

			// line is not visible here.
		} catch (Exception e) {

		}

		return sb.toString();
	
	}
}
