package com.hackathon1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "info")
public class Info implements Serializable {

	private static final long serialVersionUID = 1L;

	private String containerNum;
	private String cargoType;
	private String shippingLine;
	private String vesselName;
	private String containerSize;

	public Info() {
	}

	public Info(String cn, String ct, String sl, String vn, String cs) {
		this.containerNum = cn;
		this.cargoType = ct;
		this.shippingLine = sl;
		this.vesselName = vn;
		this.setContainerSize(cs);
	}

	public Info(String line) {
		String [] splitter = line.split(",");
		this.containerNum = splitter[0];
		this.cargoType = splitter[1];
		this.shippingLine = splitter[2];
		this.vesselName = splitter[3];
		this.containerSize = splitter[4];
	}

	public String getContainerNum() {
		return containerNum;
	}

	@XmlElement
	public void setContainerNum(String id) {
		this.containerNum = id;
	}

	public String getCargoType() {
		return cargoType;
	}

	@XmlElement
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	public String getShippingLine() {
		return shippingLine;
	}

	@XmlElement
	public void setShippingLine(String sl) {
		this.shippingLine = sl;
	}

	public String getVesselName() {
		return vesselName;
	}

	@XmlElement
	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public String getContainerSize() {
		return containerSize;
	}

	@XmlElement
	public void setContainerSize(String containerSize) {
		this.containerSize = containerSize;
	}

}
