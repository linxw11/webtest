pipeline {
  agent any
  stages {
    stage('clean build') {
      steps {
        bat 'mvn clean'
        bat 'mvn compile'
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
    stage('sonar') {
      steps {
        bat 'mvn sonar:sonar'
      }
    }
  }
}