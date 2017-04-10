Steps to set up the project in Eclipse
1. Clone and add the project into Eclipse (https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse)
2. Once the project is added, there will be errors due to missing dependencies.
3. Go to menu -> Window -> Show View -> Other... Select Maven Repositories under Maven.
4. In the window that appear, select Global Repositories -> central(http://repo.maven.apache.org/maven2), right click and select Rebuild Index
   Rebuild index may take long time and there is bug with its progress. The progress seems to stuck at 0% and once it is done, the progress will disappear.
   If it does not work (after 30 minutes and progress is still 0%), try rebuild index from Local Repositories -> Local Repository
5. Once rebuild index is done, there will be list of folders under Global Repositories -> central(http://repo.maven.apache.org/maven2) or Local Repositories -> Local Repository if it is selected for rebuild index.
6. Convert the project to maven project by right clicking the project and selecting Configure -> Convert to Maven project. Once conversion is done, the project will add all dependencies specified in pom.xml
   If both rebuild index are failed, the dependencies must be added manually from Local Repository. Typically the local repository is at "C:\Users\<username>\.m2\repository". The pom.xml contain list of required dependencies is 

To compile the project, run the following command: mvn compile -Dcheckstyle.skip=true
The checkstyle is ignored since there are 200+ errors, all mentioned that the end of file should be a new line character. 