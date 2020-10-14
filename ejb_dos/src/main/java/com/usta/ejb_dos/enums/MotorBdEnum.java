package com.usta.ejb_dos.enums;

public enum MotorBdEnum {

	POSTGRESQL(1,"postgresql"),
	MYSQL(2,"mysql");
	
	public int idBD;
	
	public String bd;

	MotorBdEnum(int idBD, String bd) {
		this.idBD = idBD;
		this.bd = bd;
	}

	public int getIdBD() {
		return idBD;
	}

	public String getBd() {
		return bd;
	}
	
}
