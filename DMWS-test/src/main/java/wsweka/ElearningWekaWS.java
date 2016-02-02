
package wsweka;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ElearningWekaWS", targetNamespace = "http://wsweka/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ElearningWekaWS {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeWithDiscritize", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteWithDiscritize")
    @ResponseWrapper(localName = "executeWithDiscritizeResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteWithDiscritizeResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeWithDiscritizeRequest", output = "http://wsweka/ElearningWekaWS/executeWithDiscritizeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeWithDiscritize/Fault/Exception")
    })
    public String executeWithDiscritize(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeWithManualDiscritize", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteWithManualDiscritize")
    @ResponseWrapper(localName = "executeWithManualDiscritizeResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteWithManualDiscritizeResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeWithManualDiscritizeRequest", output = "http://wsweka/ElearningWekaWS/executeWithManualDiscritizeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeWithManualDiscritize/Fault/Exception")
    })
    public String executeWithManualDiscritize(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeManualDescritezation", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteManualDescritezation")
    @ResponseWrapper(localName = "executeManualDescritezationResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteManualDescritezationResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeManualDescritezationRequest", output = "http://wsweka/ElearningWekaWS/executeManualDescritezationResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeManualDescritezation/Fault/Exception")
    })
    public String executeManualDescritezation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "visualizeTreeGraph", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.VisualizeTreeGraph")
    @ResponseWrapper(localName = "visualizeTreeGraphResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.VisualizeTreeGraphResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/visualizeTreeGraphRequest", output = "http://wsweka/ElearningWekaWS/visualizeTreeGraphResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/visualizeTreeGraph/Fault/Exception")
    })
    public String visualizeTreeGraph(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeClassifier", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteClassifier")
    @ResponseWrapper(localName = "executeClassifierResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteClassifierResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeClassifierRequest", output = "http://wsweka/ElearningWekaWS/executeClassifierResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeClassifier/Fault/Exception")
    })
    public String executeClassifier(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeAssociate", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteAssociate")
    @ResponseWrapper(localName = "executeAssociateResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteAssociateResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeAssociateRequest", output = "http://wsweka/ElearningWekaWS/executeAssociateResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeAssociate/Fault/Exception")
    })
    public String executeAssociate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeCluster", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteCluster")
    @ResponseWrapper(localName = "executeClusterResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteClusterResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeClusterRequest", output = "http://wsweka/ElearningWekaWS/executeClusterResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeCluster/Fault/Exception")
    })
    public String executeCluster(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeTreeClassifer", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteTreeClassifer")
    @ResponseWrapper(localName = "executeTreeClassiferResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteTreeClassiferResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeTreeClassiferRequest", output = "http://wsweka/ElearningWekaWS/executeTreeClassiferResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeTreeClassifer/Fault/Exception")
    })
    public String executeTreeClassifer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeFilter", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteFilter")
    @ResponseWrapper(localName = "executeFilterResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteFilterResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeFilterRequest", output = "http://wsweka/ElearningWekaWS/executeFilterResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeFilter/Fault/Exception")
    })
    public String executeFilter(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws JAXBException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "xmlToArrf", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.XmlToArrf")
    @ResponseWrapper(localName = "xmlToArrfResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.XmlToArrfResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/xmlToArrfRequest", output = "http://wsweka/ElearningWekaWS/xmlToArrfResponse", fault = {
        @FaultAction(className = JAXBException_Exception.class, value = "http://wsweka/ElearningWekaWS/xmlToArrf/Fault/JAXBException")
    })
    public String xmlToArrf(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws JAXBException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "executeTwo", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteTwo")
    @ResponseWrapper(localName = "executeTwoResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteTwoResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeTwoRequest", output = "http://wsweka/ElearningWekaWS/executeTwoResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/executeTwo/Fault/Exception")
    })
    public String executeTwo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param input
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "execute", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.Execute")
    @ResponseWrapper(localName = "executeResponse", targetNamespace = "http://wsweka/", className = "mz.com.wsweka.ExecuteResponse")
    @Action(input = "http://wsweka/ElearningWekaWS/executeRequest", output = "http://wsweka/ElearningWekaWS/executeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsweka/ElearningWekaWS/execute/Fault/Exception")
    })
    public String execute(
        @WebParam(name = "input", targetNamespace = "")
        String input)
        throws Exception_Exception
    ;

}