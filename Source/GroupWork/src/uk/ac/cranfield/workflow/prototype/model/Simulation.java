package uk.ac.cranfield.workflow.prototype.model;

import java.util.List;


public class Simulation
{
    
    private Integer ID;
    private Integer scientistID;
    private List<String> parameterFiles;
    private String xmlName;
    
    public Simulation(Integer scientistID, List<String> parameterFiles, String xmlName)
    {
        this.scientistID = scientistID;
        this.parameterFiles = parameterFiles;
        this.xmlName = xmlName;
    }
    
    public void addParameter(String parameterFile)
    {
        parameterFiles.add(parameterFile);
    }
    
    public Object getScientistID()
    {
        
        return scientistID;
    }
}
