package com.ustados.ejb_dos.emnus;

public enum MotorBdEnum {

    POSTGRESQL(1, "postgresql"), MYSQL(2, "mysql");

    public int idBD;

    public String bdName;

    public MotorBdEnum(int idBD, String bdName) {
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
