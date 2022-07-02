
package br.com.ufrj.engsoft.soa.publicacao.clientws.stubs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.13
 * 2022-07-01T18:09:50.151-03:00
 * Generated source version: 3.3.13
 */

@WebFault(name = "ParametroException", targetNamespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/")
public class ParametroException_Exception extends Exception {

    private br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.ParametroException faultInfo;

    public ParametroException_Exception() {
        super();
    }

    public ParametroException_Exception(String message) {
        super(message);
    }

    public ParametroException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ParametroException_Exception(String message, br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.ParametroException parametroException) {
        super(message);
        this.faultInfo = parametroException;
    }

    public ParametroException_Exception(String message, br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.ParametroException parametroException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = parametroException;
    }

    public br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.ParametroException getFaultInfo() {
        return this.faultInfo;
    }
}
