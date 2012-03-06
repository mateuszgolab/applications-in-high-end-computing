package uk.ac.cranfield.workflow.prototype.controller.mock;

import java.util.List;
import java.util.ListIterator;
import java.util.Observable;

import uk.ac.cranfield.workflow.prototype.controller.interfaces.WorkflowSequence;
import uk.ac.cranfield.workflow.prototype.model.interfaces.Module;


public class WorkflowSequenceMock extends Observable implements WorkflowSequence
{
    
    private List<Module> modules;
    private ListIterator<Module> iterator = modules.listIterator();
    private Module currentModule;
    private boolean outputState;
    private boolean inputState;
    
    @Override
    public int getNumberOfModules()
    {
        return modules.size();
    }
    
    @Override
    public void addModule(Module module)
    {
        modules.add(module);
        
    }
    
    @Override
    public void removeModule(Module module)
    {
        modules.remove(module);
        
    }
    
    
    @Override
    public void executeModule()
    {
        
        if (!iterator.hasNext())
        {
            iterator = modules.listIterator(0);
            currentModule = modules.get(0);
        }
        else
        {
            currentModule = iterator.next();
        }
        
        currentModule.execute();
    }
    
    @Override
    public void validateModuleInput()
    {
        inputState = currentModule.validateInput();
        notifyObservers();
    }
    
    @Override
    public void validateModuleOutput()
    {
        outputState = currentModule.validateOutput();
        notifyObservers();
    }
    
    
}