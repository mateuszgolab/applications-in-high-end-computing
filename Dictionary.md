# List of terms being used in project: #


---


---


## Actors ##

**User** - person who uses System.

**Scientist** - person who can use Workflow to run simulation through Terminal using Client.

**Administrator** - person responsible for configuration of the Workflow.

**Workflow Manager** - program which controls Workflow. Responsible for sending commands and parameters to particular parts.

**Recovery Manager** - program which performs all tasks in order to assure safe recovery in case of crush during execution modules of Workflow Sequence.


---


---


## Layers ##

**System** - all resources and programs used in order to achieve project's aims. Organised, logically in three layers: access, controlling and calculating one.


---

### Access layer ###

**Client** - program which gives Scientist possibility to remotely run simulation or Administrator to change settings of Workflow.

**Terminal** - place where Client runs.

---

### Control layer ###

**Workflow** - all entities: programs and modules controlling and performing simulations scientist task.

**Workflow Server** - logical machine where Workflow runs.

**Workflow Sequence** - ordered, connected list of programs performing actual work of system. Sequence of steps necessary to finish task. Set up by Administrator.

**Simulation** - all start parameters needed in Workflow Sequence plus scientist id. May be considered as a instance of Workflow Sequence.

**Simulations Queue** - queue of Simulations in Workflow sent by Scientist waiting for execution.

**Module** - single unit-program within Workflow Sequence added by Administrator.


---

### Calculation layer ###

**Calculation Server** - logical place where modules' calculations are being performed.