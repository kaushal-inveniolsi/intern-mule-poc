package com.training.model;
/**
 * @author Kaushal.Kumar
 *
 */
public class LineItems {
	String recordType, refDocNum, city;
	int lineNumber;
	float amount;
	public LineItems() {
		super();
	}
	public LineItems(String recordType, String refDocNum, String city, int lineNumber, float amount) {
		super();
		this.recordType = recordType;
		this.refDocNum = refDocNum;
		this.city = city;
		this.lineNumber = lineNumber;
		this.amount = amount;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getRefDocNum() {
		return refDocNum;
	}
	public void setRefDocNum(String refDocNum) {
		this.refDocNum = refDocNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "LineItems [recordType=" + recordType + ", lineNumber="
				+ lineNumber + ", refDocNum=" + refDocNum + ", city=" + city + ", amount=" + amount + "]";
	}
}