GradleSpringMVC
===============

Simple Spring MVC application with gradle and configured to work directly within STS using the gradle plugin. 
Can also deploy and run within the default vFabric server.

After cloning the repo, navigate to the project root directory in your shell and run the following command..
gradle eclipse

This will create the necessary artifacts for to allow you to import the project into Spring Tool Suite.

If you have the gradle plugin installed then after importing the gradle project you will be able to manage the project entirely from within STS at this point.
This includes..
  1: All gradle commands are runnable via the gradle tasks view (build etc)
  2: Dependencies can be updated by right clicking on the project and selecting gradle -> refresh all.
  3: You can drag and drop the project directly onto a vFabric server to deploy and run it (all facets are configured properly to allow this)



