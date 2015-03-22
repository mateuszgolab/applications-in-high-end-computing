# Description #

Create a workflow simulation model for a complex system, where the program should schedule the execution of each modules.

# Functional Requirements #

  * FU1 User can add/remove arbitrary number of modules into workflow.
  * FU2 User can run simulation with uploaded parameters.
  * FU3 Recovery system: possibility of restarting workflow (from the last stable/good point) when system crushes.
    * FU3.1 Monitoring of errors: Users can see the exact location of failures.
    * FU3.2 Flexible recovery policy (depending on expected time of execution we decide to store data before/after module or after each iteration)
  * FU4 Many users have possibility to connect to system simultaneously. But there is only one running program at time (users requests' go to queue - serial workflow).
  * FU5 User can stop simulation.


# Non-functional Requirements #

  * NF1 Reliability/Validation: take care of input/output formats of specific modules.
  * NF2 Use universal/independent communication standards between modules
  * NF3 Data flow should be based on XML files.
  * NF4 Modules can run on many different remote systems using different platforms but hey have to be already installed.
  * NF5 Network connection between terminal, workload server and remote systems are established.