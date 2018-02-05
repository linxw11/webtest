pipeline {
  agent any
  stages {
    stage('clean build') {
      steps {
        bat 'mvn clean'
        bat 'mvn compile'
      }
    }
    stage('sonar') {
      steps {
        bat 'mvn sonar:sonar'
      }
    }
    stage('UT') {
      steps {
        bat 'mvn test'
        junit 'target/surefire-reports/*.xml'
        pwd()
        jacoco(execPattern: '**/target/**.exec')
      }
    }
  }
}
