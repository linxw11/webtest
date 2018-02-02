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
        junit './target/surefire-reports'
      }
    }
  }
}