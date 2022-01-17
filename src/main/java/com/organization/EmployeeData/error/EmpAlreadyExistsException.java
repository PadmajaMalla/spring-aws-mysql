package com.organization.EmployeeData.error;

public class EmpAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 6191550727495017492L;

	public EmpAlreadyExistsException(String msg) {
		super(msg);
	}
}
