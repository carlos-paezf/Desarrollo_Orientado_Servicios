package org.tempuri;

public class ISistemStatusProxy implements org.tempuri.ISistemStatus {
  private String _endpoint = null;
  private org.tempuri.ISistemStatus iSistemStatus = null;
  
  public ISistemStatusProxy() {
    _initISistemStatusProxy();
  }
  
  public ISistemStatusProxy(String endpoint) {
    _endpoint = endpoint;
    _initISistemStatusProxy();
  }
  
  private void _initISistemStatusProxy() {
    try {
      iSistemStatus = (new org.tempuri.SistemStatusLocator()).getBasicHttpBinding_ISistemStatus();
      if (iSistemStatus != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iSistemStatus)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iSistemStatus)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iSistemStatus != null)
      ((javax.xml.rpc.Stub)iSistemStatus)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ISistemStatus getISistemStatus() {
    if (iSistemStatus == null)
      _initISistemStatusProxy();
    return iSistemStatus;
  }
  
  public java.lang.String loginUsuario(java.lang.String p_NombreUsuario, java.lang.String p_Password) throws java.rmi.RemoteException{
    if (iSistemStatus == null)
      _initISistemStatusProxy();
    return iSistemStatus.loginUsuario(p_NombreUsuario, p_Password);
  }
  
  public java.lang.Integer webStatus(java.lang.String token, org.datacontract.schemas._2004._07.SICC_Domain.WebStatus objWebStatus) throws java.rmi.RemoteException{
    if (iSistemStatus == null)
      _initISistemStatusProxy();
    return iSistemStatus.webStatus(token, objWebStatus);
  }
  
  
}