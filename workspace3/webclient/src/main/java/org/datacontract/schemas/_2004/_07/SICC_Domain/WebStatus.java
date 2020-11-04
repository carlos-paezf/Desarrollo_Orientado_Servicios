/**
 * WebStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SICC_Domain;

public class WebStatus  implements java.io.Serializable {
    private java.util.Calendar creadoUTC;

    private java.lang.Boolean disponible;

    private java.util.Calendar fechaUTC;

    private java.lang.Integer idApp;

    private java.lang.String observaciones;

    private java.lang.String usuarioCreador;

    public WebStatus() {
    }

    public WebStatus(
           java.util.Calendar creadoUTC,
           java.lang.Boolean disponible,
           java.util.Calendar fechaUTC,
           java.lang.Integer idApp,
           java.lang.String observaciones,
           java.lang.String usuarioCreador) {
           this.creadoUTC = creadoUTC;
           this.disponible = disponible;
           this.fechaUTC = fechaUTC;
           this.idApp = idApp;
           this.observaciones = observaciones;
           this.usuarioCreador = usuarioCreador;
    }


    /**
     * Gets the creadoUTC value for this WebStatus.
     * 
     * @return creadoUTC
     */
    public java.util.Calendar getCreadoUTC() {
        return creadoUTC;
    }


    /**
     * Sets the creadoUTC value for this WebStatus.
     * 
     * @param creadoUTC
     */
    public void setCreadoUTC(java.util.Calendar creadoUTC) {
        this.creadoUTC = creadoUTC;
    }


    /**
     * Gets the disponible value for this WebStatus.
     * 
     * @return disponible
     */
    public java.lang.Boolean getDisponible() {
        return disponible;
    }


    /**
     * Sets the disponible value for this WebStatus.
     * 
     * @param disponible
     */
    public void setDisponible(java.lang.Boolean disponible) {
        this.disponible = disponible;
    }


    /**
     * Gets the fechaUTC value for this WebStatus.
     * 
     * @return fechaUTC
     */
    public java.util.Calendar getFechaUTC() {
        return fechaUTC;
    }


    /**
     * Sets the fechaUTC value for this WebStatus.
     * 
     * @param fechaUTC
     */
    public void setFechaUTC(java.util.Calendar fechaUTC) {
        this.fechaUTC = fechaUTC;
    }


    /**
     * Gets the idApp value for this WebStatus.
     * 
     * @return idApp
     */
    public java.lang.Integer getIdApp() {
        return idApp;
    }


    /**
     * Sets the idApp value for this WebStatus.
     * 
     * @param idApp
     */
    public void setIdApp(java.lang.Integer idApp) {
        this.idApp = idApp;
    }


    /**
     * Gets the observaciones value for this WebStatus.
     * 
     * @return observaciones
     */
    public java.lang.String getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this WebStatus.
     * 
     * @param observaciones
     */
    public void setObservaciones(java.lang.String observaciones) {
        this.observaciones = observaciones;
    }


    /**
     * Gets the usuarioCreador value for this WebStatus.
     * 
     * @return usuarioCreador
     */
    public java.lang.String getUsuarioCreador() {
        return usuarioCreador;
    }


    /**
     * Sets the usuarioCreador value for this WebStatus.
     * 
     * @param usuarioCreador
     */
    public void setUsuarioCreador(java.lang.String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebStatus)) return false;
        WebStatus other = (WebStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creadoUTC==null && other.getCreadoUTC()==null) || 
             (this.creadoUTC!=null &&
              this.creadoUTC.equals(other.getCreadoUTC()))) &&
            ((this.disponible==null && other.getDisponible()==null) || 
             (this.disponible!=null &&
              this.disponible.equals(other.getDisponible()))) &&
            ((this.fechaUTC==null && other.getFechaUTC()==null) || 
             (this.fechaUTC!=null &&
              this.fechaUTC.equals(other.getFechaUTC()))) &&
            ((this.idApp==null && other.getIdApp()==null) || 
             (this.idApp!=null &&
              this.idApp.equals(other.getIdApp()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              this.observaciones.equals(other.getObservaciones()))) &&
            ((this.usuarioCreador==null && other.getUsuarioCreador()==null) || 
             (this.usuarioCreador!=null &&
              this.usuarioCreador.equals(other.getUsuarioCreador())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCreadoUTC() != null) {
            _hashCode += getCreadoUTC().hashCode();
        }
        if (getDisponible() != null) {
            _hashCode += getDisponible().hashCode();
        }
        if (getFechaUTC() != null) {
            _hashCode += getFechaUTC().hashCode();
        }
        if (getIdApp() != null) {
            _hashCode += getIdApp().hashCode();
        }
        if (getObservaciones() != null) {
            _hashCode += getObservaciones().hashCode();
        }
        if (getUsuarioCreador() != null) {
            _hashCode += getUsuarioCreador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SICC.Domain", "WebStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creadoUTC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SICC.Domain", "CreadoUTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SICC.Domain", "Disponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaUTC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SICC.Domain", "FechaUTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SICC.Domain", "IdApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SICC.Domain", "Observaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioCreador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SICC.Domain", "UsuarioCreador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
