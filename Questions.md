## Question to ask ##


---


---


### Major ###

  * 1 Responsibility for reports. Are all team members responsible for all reports or shell we specify in report who was responsible for it?
  * 2 How important is the document about project/team management ?
  * 3 Are we supposed to implement integration test, or only plan them?


  * 4. - AGAIN - If there is a system (of course totally independent from HPC project) where many users have possibility to connect to it simultaneously - is this feature functional or non-functional requirement?

The functional requirement would be the ability to submit jobs to arbitrary platforms. The non-functional requirement would be to have access to appropriate resources, regardless of the details of whether other people would be connected to it.

  * 5. There is a suggestion for non-functional requirements that, they should be measurable. They should contains concrete values. "Modules can run on many different remote systems using different platforms but hey have to be already installed." Maybe we should ask about that what type of systems we should support.

  * 6. How many users will use Workflow ? Important from non-functional requirements tests point of view.

  * 7. Literature review - should be only included in Project Management document or rather separated into 4 others deliverables?


---

### Minor ###

  * 1 Shall we paralelise workflow? How can we paralelize otherwise?
  * 2 We should mention that there is a possibility to use translator, but it is a simple module too (maybe just in the dictionary can be enough)


---


---

## Answered Questions - the newer the bigger number ##

1. Shall user (scientist) have possibility to abort simulation during execution of workflow?

**Yes, why not, although it isn't strictly part of the requirements.**

2. Is established network connection a user non-functional requirement or shall we ignore it and remove from requirements list?

**Stable network connectivity is a non-functional requirement as it specifies a potential constraint on the operation of the completed system**

3. If there is a system (of course totally independent from HPC project) where many users have possibility to connect to it simultaneously - is this feature functional or non-functional requirement?

**The functional requirement would be the ability to submit jobs to arbitrary platforms. The non-functional requirement would be to have access to appropriate resources, regardless of the details of whether other people would be connected to it.**

4. If there is another system (of course totally independent from HPC project)  and internal part of this system would be so called Recovery Manager responsible for different activities connected with data recovery, shall we treat it as a actor in use case diagram? Or rather ignore it and place rather in design part?

**You can use the Recovery Manager as an actor in a Use Case diagram, certainly. It would allow you to specify the functionality that is the responsibility of that sub-system.**

5. Are Dispatcher, XML descriptor and XML descriptor interpreter elements of requirements or rather proposed design parts? Should we assume that everything included in "Application in High End Computing - Group Project" notes is a kind of requirement or some of them are just suggestions how to resolve problems or design program?

**No, the XML elements were suggested ways of looking at the problem. I am happy for you to take whatever approach you think is best.**

6. Can we assume that program (module) installed on remote system is able to send back results to our workflow server? Or do we have to assume that administrator should install a wrapper responsible to send back module's result?

**I think that will be a key part of your design. Somehow, the activities on a remote server need to be communicated to the process managing the workflow. The implementation details for this are not important at this point, however you need to make a decision regarding the overall design. You may need to install a server on the remote system, responsible for sending the results back, or perhaps the workflow manager can query the remote process directly somehow. This is an argument between the use of push or pull communications in your design. It's you decision!**