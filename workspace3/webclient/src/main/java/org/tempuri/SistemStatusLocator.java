/**
 * SistemStatusLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SistemStatusLocator extends org.apache.axis.client.Service implements org.tempuri.SistemStatus {

    public SistemStatusLocator() {
    }


    public SistemStatusLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SistemStatusLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ISistemStatus
    private java.lang.String BasicHttpBinding_ISistemStatus_address = "http://200.122.223.34/SICC_WS/SistemStatus.svc";

    public java.lang.String getBasicHttpBinding_ISistemStatusAddress() {
        return BasicHttpBinding_ISistemStatus_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ISistemStatusWSDDServiceName = "BasicHttpBinding_ISistemStatus";

    public java.lang.String getBasicHttpBinding_ISistemStatusWSDDServiceName() {
        return BasicHttpBinding_ISistemStatusWSDDServiceName;
    }

    public void setBasicHttpBinding_ISistemStatusWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ISistemStatusWSDDServiceName = name;
    }

    public org.tempuri.ISistemStatus getBasicHttpBinding_ISistemStatus() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ISistemStatus_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ISistemStatus(endpoint);
    }

    public org.tempuri.ISistemStatus getBasicHttpBinding_ISistemStatus(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_ISistemStatusStub _stub = new org.tempuri.BasicHttpBinding_ISistemStatusStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ISistemStatusWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ISistemStatusEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ISistemStatus_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.ISistemStatus.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_ISistemStatusStub _stub = new org.tempuri.BasicHttpBinding_ISistemStatusStub(new java.net.URL(BasicHttpBinding_ISistemStatus_address), this);
                _stub.setPortName(getBasicHttpBinding_ISistemStatusWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ISistemStatus".equals(inputPortName)) {
            return getBasicHttpBinding_ISistemStatus();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "SistemStatus");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ISistemStatus"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ISistemStatus".equals(portName)) {
            setBasicHttpBinding_ISistemStatusEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
