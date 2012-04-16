## This is a fork

This is a fork of pbs4java. Created to create a proposal for enhancements.

The following items will be proposed to the forked project:

* Use standard Maven directory structure. This can help other developers that 
would like to contribute to the project.

* Include LICENSE file

* Correct project URL (it was set to Apache Maven)

* Correct project License in pom.xml (it was set to Apache License)

* Write better tests with a test double

* Create maven site. This site contains reports and other useful 
information for users and developers.

* Drop ant support. This is not necessarily needed. However, if maintained, 
I believe the ant could be simplified.

* Deploy artifacts to Maven central. Otherwise other artifacts using pbs4java 
would have a hard time using this API (in case they decided to release to 
maven central repository)