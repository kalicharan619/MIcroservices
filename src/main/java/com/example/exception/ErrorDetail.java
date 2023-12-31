package com.example.exception;

import java.util.Date;

public class ErrorDetail {
	
	private String errorMsg;
	private String errorCode;
	private Date timeStamp;
	public ErrorDetail(String errorMsg, String errorCode, Date timeStamp) {
		super();
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
		this.timeStamp = timeStamp;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	

}
