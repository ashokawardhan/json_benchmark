
package jackson_json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Servletmapping {

    private String cofaxCDS;
    private String cofaxEmail;
    private String cofaxAdmin;
    private String fileServlet;
    private String cofaxTools;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The cofaxCDS
     */
    public String getCofaxCDS() {
        return cofaxCDS;
    }

    /**
     * 
     * @param cofaxCDS
     *     The cofaxCDS
     */
    public void setCofaxCDS(String cofaxCDS) {
        this.cofaxCDS = cofaxCDS;
    }

    /**
     * 
     * @return
     *     The cofaxEmail
     */
    public String getCofaxEmail() {
        return cofaxEmail;
    }

    /**
     * 
     * @param cofaxEmail
     *     The cofaxEmail
     */
    public void setCofaxEmail(String cofaxEmail) {
        this.cofaxEmail = cofaxEmail;
    }

    /**
     * 
     * @return
     *     The cofaxAdmin
     */
    public String getCofaxAdmin() {
        return cofaxAdmin;
    }

    /**
     * 
     * @param cofaxAdmin
     *     The cofaxAdmin
     */
    public void setCofaxAdmin(String cofaxAdmin) {
        this.cofaxAdmin = cofaxAdmin;
    }

    /**
     * 
     * @return
     *     The fileServlet
     */
    public String getFileServlet() {
        return fileServlet;
    }

    /**
     * 
     * @param fileServlet
     *     The fileServlet
     */
    public void setFileServlet(String fileServlet) {
        this.fileServlet = fileServlet;
    }

    /**
     * 
     * @return
     *     The cofaxTools
     */
    public String getCofaxTools() {
        return cofaxTools;
    }

    /**
     * 
     * @param cofaxTools
     *     The cofaxTools
     */
    public void setCofaxTools(String cofaxTools) {
        this.cofaxTools = cofaxTools;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
