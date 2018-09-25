package com.mohit.test;

import java.util.ArrayList;
import java.util.List;

public class Details {
	private int detailID;
	
	private List<String> parts = new ArrayList<>();

	public Details(int detailID, List<String> parts) {
		super();
		this.detailID = detailID;
		this.parts = parts;
	}

	public int getDetailID() {
		return detailID;
	}

	public void setDetailID(int detailID) {
		this.detailID = detailID;
	}

	public List<String> getParts() {
		return parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	
	
	
}
