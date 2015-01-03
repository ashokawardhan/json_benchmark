
package jackson_json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Medium {

    private Webapp webapp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The webapp
     */
    public Webapp getWebapp() {
        return webapp;
    }

    /**
     * 
     * @param webapp
     *     The webapp
     */
    public void setWebapp(Webapp webapp) {
        this.webapp = webapp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
