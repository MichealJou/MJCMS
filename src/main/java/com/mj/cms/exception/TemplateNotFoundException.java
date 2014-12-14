package com.mj.cms.exception;

/**
 * 没有找到模板
 * @author zhouping
 * @version 1.0.0
 *
 */
public class TemplateNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TemplateNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemplateNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TemplateNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TemplateNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TemplateNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
