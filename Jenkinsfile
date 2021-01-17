node {
  stage 'Build and Test'
  // Build using a plain docker container, not our local Dockerfile
  def mvnContainer = docker.image('adoptopenjdk/maven-openjdk11')
  mvnContainer.inside('-v /m2repo:/m2repo') {

      sh 'mvn clean package'
   }
}