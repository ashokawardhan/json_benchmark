
package jackson_json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Webapp {

    private List<Servlet> servlet = new ArrayList<Servlet>();
    private Servletmapping servletmapping;
    private Taglib taglib;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The servlet
     */
    public List<Servlet> getServlet() {
        return servlet;
    }

    /**
     * 
     * @param servlet
     *     The servlet
     */
    public void setServlet(List<Servlet> servlet) {
        this.servlet = servlet;
    }

    /**
     * 
     * @return
     *     The servletmapping
     */
    public Servletmapping getServletmapping() {
        return servletmapping;
    }

    /**
     * 
     * @param servletmapping
     *     The servletmapping
     */
    public void setServletmapping(Servletmapping servletmapping) {
        this.servletmapping = servletmapping;
    }

    /**
     * 
     * @return
     *     The taglib
     */
    public Taglib getTaglib() {
        return taglib;
    }

    /**
     * 
     * @param taglib
     *     The taglib
     */
    public void setTaglib(Taglib taglib) {
        this.taglib = taglib;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
