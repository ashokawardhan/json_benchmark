
package jackson_json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Initparam {

    private String templatePath;
    private Integer log;
    private String logLocation;
    private String logMaxSize;
    private Integer dataLog;
    private String dataLogLocation;
    private String dataLogMaxSize;
    private String removePageCache;
    private String removeTemplateCache;
    private String fileTransferFolder;
    private Integer lookInContext;
    private Integer adminGroupID;
    private Boolean betaServer;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The templatePath
     */
    public String getTemplatePath() {
        return templatePath;
    }

    /**
     * 
     * @param templatePath
     *     The templatePath
     */
    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    /**
     * 
     * @return
     *     The log
     */
    public Integer getLog() {
        return log;
    }

    /**
     * 
     * @param log
     *     The log
     */
    public void setLog(Integer log) {
        this.log = log;
    }

    /**
     * 
     * @return
     *     The logLocation
     */
    public String getLogLocation() {
        return logLocation;
    }

    /**
     * 
     * @param logLocation
     *     The logLocation
     */
    public void setLogLocation(String logLocation) {
        this.logLocation = logLocation;
    }

    /**
     * 
     * @return
     *     The logMaxSize
     */
    public String getLogMaxSize() {
        return logMaxSize;
    }

    /**
     * 
     * @param logMaxSize
     *     The logMaxSize
     */
    public void setLogMaxSize(String logMaxSize) {
        this.logMaxSize = logMaxSize;
    }

    /**
     * 
     * @return
     *     The dataLog
     */
    public Integer getDataLog() {
        return dataLog;
    }

    /**
     * 
     * @param dataLog
     *     The dataLog
     */
    public void setDataLog(Integer dataLog) {
        this.dataLog = dataLog;
    }

    /**
     * 
     * @return
     *     The dataLogLocation
     */
    public String getDataLogLocation() {
        return dataLogLocation;
    }

    /**
     * 
     * @param dataLogLocation
     *     The dataLogLocation
     */
    public void setDataLogLocation(String dataLogLocation) {
        this.dataLogLocation = dataLogLocation;
    }

    /**
     * 
     * @return
     *     The dataLogMaxSize
     */
    public String getDataLogMaxSize() {
        return dataLogMaxSize;
    }

    /**
     * 
     * @param dataLogMaxSize
     *     The dataLogMaxSize
     */
    public void setDataLogMaxSize(String dataLogMaxSize) {
        this.dataLogMaxSize = dataLogMaxSize;
    }

    /**
     * 
     * @return
     *     The removePageCache
     */
    public String getRemovePageCache() {
        return removePageCache;
    }

    /**
     * 
     * @param removePageCache
     *     The removePageCache
     */
    public void setRemovePageCache(String removePageCache) {
        this.removePageCache = removePageCache;
    }

    /**
     * 
     * @return
     *     The removeTemplateCache
     */
    public String getRemoveTemplateCache() {
        return removeTemplateCache;
    }

    /**
     * 
     * @param removeTemplateCache
     *     The removeTemplateCache
     */
    public void setRemoveTemplateCache(String removeTemplateCache) {
        this.removeTemplateCache = removeTemplateCache;
    }

    /**
     * 
     * @return
     *     The fileTransferFolder
     */
    public String getFileTransferFolder() {
        return fileTransferFolder;
    }

    /**
     * 
     * @param fileTransferFolder
     *     The fileTransferFolder
     */
    public void setFileTransferFolder(String fileTransferFolder) {
        this.fileTransferFolder = fileTransferFolder;
    }

    /**
     * 
     * @return
     *     The lookInContext
     */
    public Integer getLookInContext() {
        return lookInContext;
    }

    /**
     * 
     * @param lookInContext
     *     The lookInContext
     */
    public void setLookInContext(Integer lookInContext) {
        this.lookInContext = lookInContext;
    }

    /**
     * 
     * @return
     *     The adminGroupID
     */
    public Integer getAdminGroupID() {
        return adminGroupID;
    }

    /**
     * 
     * @param adminGroupID
     *     The adminGroupID
     */
    public void setAdminGroupID(Integer adminGroupID) {
        this.adminGroupID = adminGroupID;
    }

    /**
     * 
     * @return
     *     The betaServer
     */
    public Boolean getBetaServer() {
        return betaServer;
    }

    /**
     * 
     * @param betaServer
     *     The betaServer
     */
    public void setBetaServer(Boolean betaServer) {
        this.betaServer = betaServer;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
