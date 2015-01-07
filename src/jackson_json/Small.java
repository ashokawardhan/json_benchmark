
package jackson_json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "debug",
    "num"
})
public class Small {

    @JsonProperty("debug")
    private String debug;
    @JsonProperty("num")
    private Integer num;
    @JsonIgnore
    /**
     * 
     * @return
     *     The debug
     */
    @JsonProperty("debug")
    public String getDebug() {
        return debug;
    }

    /**
     * 
     * @param debug
     *     The debug
     */
    @JsonProperty("debug")
    public void setDebug(String debug) {
        this.debug = debug;
    }

    /**
     * 
     * @return
     *     The num
     */
    @JsonProperty("num")
    public Integer getNum() {
        return num;
    }

    /**
     * 
     * @param num
     *     The num
     */
    @JsonProperty("num")
    public void setNum(Integer num) {
        this.num = num;
    }


}
