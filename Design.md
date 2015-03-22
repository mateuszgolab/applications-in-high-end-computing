# Validation #
  * 1 Validation is being done by XSD files.
  * 2 One XSD file between two modules.
  * 3 Workflow consists of:
    * a) modules(so called translator are also modules)
    * b) format validation files (XSD)
    * c) module metadata files (commands/parameters XML)


# Authentication #
  * 1 Authentication mechanism should be provided.
  * 2 Different roles will be provided (admin, scientist)

# Design details #

## Patterns ##
### Control flow pattern : Sequential workflow pattern ###
The workflow controls the sequence of activities and decides which of the steps will execute next. Consider sequential workflows if you must execute a series of predefined steps to accomplish a certain task.


The sequence pattern is used to model consecutive steps in a workflow process and is directly supported by each of the workflow management systems available. The typical implementation involves linking two activities with an unconditional control flow arrow.

<img src='http://www.workflowpatterns.com/patterns/control/images/fig1.png' />

http://www.workflowpatterns.com/patterns/control/basic/wcp1.php

### Data pattern : Task Data ###
Data elements can be defined by tasks which are accessible only within the context of individual execution instances of that task.

http://www.workflowpatterns.com/patterns/data/visibility/wdp1.php

### Resource pattern : Automatic execution ###

Every module in a workflow is managing resources independently. There is no Workflow's external polity to manage resources. Module is able to execute independently once the specified enabling criteria are met (enough resources available to run module)

http://www.workflowpatterns.com/patterns/resource/creation/wrp11.php

### Presentation pattern : ###


## Markup authoring mode ##
Choose this option if the workflow will change more frequently over time, if your business rules associated with the workflow can be easily expressed using markup languages, you do not need to create new workflow types, and you need the flexibility to update the workflow model without rebuilding the workflow types referenced by the model.

### Error/Exception Types ###

  * Module failure
  * Timeout
  * Resource unavailability

### Recovery actions ###
  * Rollback
Process should be undone to the last stable point in workflow.
  * Suspend
Process should stop when error occured N times in the same point of workflow.

<img src='http://typo3.org/typo3temp/tx_rlmpofficelib_8e75b40cdb.gif' />


## Questions ##
  * how to store data in Workflow program ? database or xml ?


## Workflow Design document ##
http://code.google.com/p/applications-in-high-end-computing/source/browse/#svn%2Ftrunk%2FDocs