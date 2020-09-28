package com.ustados.ejb_dos.enums;

public enum MotorBdEnum {

    POSTGRESQL(1, "postgresql"), MYSQL(2, "mysql");

    public int idBD;

    public String bdName;

    MotorBdEnum(int idBD, String bdName) {
        this.idBD = idBD;
        this.bdName = bdName;
    }

    public int getIdBD() {
        return idBD;
    }

    public String getBdName() {
        return bdName;
    }

}
