
package jackson_json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

public class Webapp
{
    private Taglib taglib;

    private Servletmapping servletmapping;

    private Servlet[] servlet;

    public Taglib getTaglib ()
    {
        return taglib;
    }

    public void setTaglib (Taglib taglib)
    {
        this.taglib = taglib;
    }

    public Servletmapping getServletmapping ()
    {
        return servletmapping;
    }

    public void setServletmapping (Servletmapping servletmapping)
    {
        this.servletmapping = servletmapping;
    }

    public Servlet[] getServlet ()
    {
        return servlet;
    }

    public void setServlet (Servlet[] servlet)
    {
        this.servlet = servlet;
    }
}
