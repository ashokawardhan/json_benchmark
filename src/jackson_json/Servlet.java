
package jackson_json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Servlet {

    private String servletname;
    private String servletclass;
    private Initparam initparam;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The servletname
     */
    public String getServletname() {
        return servletname;
    }

    /**
     * 
     * @param servletname
     *     The servletname
     */
    public void setServletname(String servletname) {
        this.servletname = servletname;
    }

    /**
     * 
     * @return
     *     The servletclass
     */
    public String getServletclass() {
        return servletclass;
    }

    /**
     * 
     * @param servletclass
     *     The servletclass
     */
    public void setServletclass(String servletclass) {
        this.servletclass = servletclass;
    }

    /**
     * 
     * @return
     *     The initparam
     */
    public Initparam getInitparam() {
        return initparam;
    }

    /**
     * 
     * @param initparam
     *     The initparam
     */
    public void setInitparam(Initparam initparam) {
        this.initparam = initparam;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
