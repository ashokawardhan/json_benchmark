
package jackson_json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Taglib {

    private String tagliburi;
    private String tagliblocation;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tagliburi
     */
    public String getTagliburi() {
        return tagliburi;
    }

    /**
     * 
     * @param tagliburi
     *     The tagliburi
     */
    public void setTagliburi(String tagliburi) {
        this.tagliburi = tagliburi;
    }

    /**
     * 
     * @return
     *     The tagliblocation
     */
    public String getTagliblocation() {
        return tagliblocation;
    }

    /**
     * 
     * @param tagliblocation
     *     The tagliblocation
     */
    public void setTagliblocation(String tagliblocation) {
        this.tagliblocation = tagliblocation;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
