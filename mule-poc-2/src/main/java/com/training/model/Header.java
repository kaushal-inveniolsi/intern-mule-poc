package com.training.model;
/**
 * @author Kaushal.Kumar
 *
 */
public class Header {
	String recordType, currentDate;
	int totalLines, minAmt;
	float  totalAmt;
	public Header() {
		super();
	}
	public Header(String recordType, String currentDate, int totalLines, int minAmt, float totalAmt) {
		super();
		this.recordType = recordType;
		this.currentDate = currentDate;
		this.totalLines = totalLines;
		this.minAmt = minAmt;
		this.totalAmt = totalAmt;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public int getTotalLines() {
		return totalLines;
	}
	public void setTotalLines(int totalLines) {
		this.totalLines = totalLines;
	}
	public int getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(int minAmt) {
		this.minAmt = minAmt;
	}
	public float getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}
	@Override
	public String toString() {
		return "Header [recordType=" + recordType + ", totalLines=" + totalLines
				+ ", totalAmt=" + totalAmt + ", minAmt=" + minAmt + ", currentDate=" + currentDate +"]";
	}	
	
}