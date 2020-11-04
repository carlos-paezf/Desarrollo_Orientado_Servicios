/**
 * ISistemStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ISistemStatus extends java.rmi.Remote {
    public java.lang.String loginUsuario(java.lang.String p_NombreUsuario, java.lang.String p_Password) throws java.rmi.RemoteException;
    public java.lang.Integer webStatus(java.lang.String token, org.datacontract.schemas._2004._07.SICC_Domain.WebStatus objWebStatus) throws java.rmi.RemoteException;
}
