## Run Jacoco test coverage
mvn clean org.jacoco:jacoco-maven-plugin:0.8.8:prepare-agent  verify org.jacoco:jacoco-maven-plugin:0.8.8:report

## Run SonarQube 
1. Start Docker container 
- for the first time: docker run -d --name sonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest
- Otherwise start Docker Desktop and start the container
2. run mvn with jacoco and sonar so that code coverage is also included:
- mvn clean org.jacoco:jacoco-maven-plugin:0.8.8:prepare-agent verify org.jacoco:jacoco-maven-plugin:0.8.8:report sonar:sonar -Dsonar.projectKey=mavenTest -Dsonar.projectName='mavenTest' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_2139028b49c023a8e02dd695b673f353e66eae38 
- Without jacoco: mvn clean verify sonar:sonar -Dsonar.projectKey=mavenTest -Dsonar.projectName='mavenTest' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_2139028b49c023a8e02dd695b673f353e66eae38


## For the SonarQube Page (at localhost9000)
- username: admin
- pwd: maventest