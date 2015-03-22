# Introduction #

Brief research about acceptance testing

# Acceptance test #

**acceptance testing**: validation testing with respect to user needs, require ments, and business processes conducted to determine whether or not to accept the system.
problem: if an error occur at the end of the project it can be expensive
other names: functional test, black box test


**Trace-ability Matrix**(requirements / Use cases)
| | Req1 | ... | Reqn |
|:|:-----|:----|:-----|
| Use-Case1 | o |  |  |
| Use-Case2 | o |  |  |
| ... |  |  |  |
| Use-Casem |  | o |  |

(problem if one of the requirements doesn't covered with use-case)

![http://www.ibm.com/developerworks/rational/library/04/r-3217/3217_fig3.jpg](http://www.ibm.com/developerworks/rational/library/04/r-3217/3217_fig3.jpg)

To test that all the (functional)requirements are covered with use-cases.
Useful in case of requirement change.


**Trace-ability Matrix**(Request or Use cases / Test Cases)

(two version: in the columns there can be use-cases or requirements )

| | Use-Case1 | ... | Use-Casem |
|:|:----------|:----|:----------|
| Test-Case1 | o |  |  |
| Test-Case2 | o |  |  |
| ... |  |  |  |
| Test-Casek |  |  | o |

(problem if one of the use-cases doesn't covered with test-case)

http://en.wikipedia.org/wiki/Traceability_matrix

# Test Case #

Test cases specify for each testing requirement:

  * The exact input values that will be input and the values of any standing data that is required,
  * The exact output values and changes of value of the internal system state that are expected,
  * And any special steps for setting up the tests.

http://qaquestions.net/wp-content/uploads/2010/04/Test-Case_Login1.pdf

# Requirement test #
Early stage - requirement test (there is no good method for this)
Usually a review, made by the stakeholders. customer need to accept it.

http://www.softwaretestinghelp.com/how-to-test-software-requirements-specification-srs/

“Requirements should be clear and specific with no uncertainty, requirements should be measurable in terms of specific values, requirements should be testable having some evaluation criteria for each requirement, and requirements should be complete, without any contradictions”

Problems with the Requirement:
  * concrete values to the non-functional requirement(e.g.: how fast it need to be? in ms)
  * requirements should be clear and consistent
  * Discover missing requirements, it must be complete(what is not in the requirment that not part of the system)
  * clarify / remove assumptions (can't leave assumptions in the requirement)
  * check if the requirements are related to the project goal (Try to avoid the irrelevant requirements)

Maybe requiremnt doesn't cover the followings:
  * Project functionality (What should be done and what should not)
  * Software, Hardware interfaces and user interface
  * System Correctness, Security and performance criteria
  * Implementation issues (risks) if any


The basic issues that the SRS writer(s) shall address are the following (IEEE standard):
  * Functionality. What is the software supposed to do?
  * External interfaces. How does the software interact with people, the systems hardware, other hardware, and other software?
  * Performance. What is the speed, availability, response time, recovery time of various software functions, etc.?
  * Attributes. What are the portability, correctness, maintainability, security, etc. considerations?
  * Design constraints imposed on an implementation. Are there any required standards in effect, implementation language, policies for database integrity, resource limits, operating environment(s) etc.?

An SRS should be(IEEE standard)
  * Correct
  * Unambiguous
  * Complete
  * Consistent
  * Ranked for importance and/or stability
  * Verifiable
  * Modifiable
  * Traceable

**Questions**
  * Dispatcher is a requirement?
  * We should mention that there is a possibility to use translator, but it is a simple module too (maybe just in the dictionary can be enough)
  * are all infos contained in slides requirements or some of them are just suggestions how to resolve problems

**References**
  * Dorothy Graham, Erik van Veenendaal, Isabel Evans, Rex Black : "FOUNDATIONS OF SOFTWARE TESTING"
  * Brian Hambling  : "SOFTWARE TESTING - An ISTQB–ISEB Foundation Guide", 2nd Edition, 2010
  * Rex Black, Jamie Mitchell : Advanced Software Testing Vol. 3 2011