# Configuration files #

Role of each configuration file.

N = number of modules in the workflow.

M = number of simulations in the workflowQueue

## conf.xml ##

Contains parameters for the main application.

Number of files: 1

Contents:
```xml

<skipBackupTimeLimit value=10000>

<numberOfLastBackups value=3>

<restoreGapTime value=500>

<workflowFailureAction value=(RESTART_SIMULATION|TERMINATE|RESTART_RECOVERY)>

<mailNotification value=(TRUE|FALSE)>

```

The time value are in seconds.

## moduleParameters.xml ##

Contains bunch of information for each module.

Number of files: N

```xml

<estimatedTime value=10000>

<numberOfProcessors value=3>

<executionCommand value="ssh 135.123.456.789 ./module1 -50 mesh.dat">

```


## validator.xsd ##

XSD file for validate input and output of each module.

Number of files: N

## scientistParameters.xml ##

XSD file for validate input and output of each module.

Number of files: M

## initialParametersSkeleton.xml ##

Structure of input parameters of first module in the workflow sequence.

Number of files: 1