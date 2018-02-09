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
    stage('war package') {
      steps {
        sleep 1
      }
    }
    stage('docker push') {
      steps {
        sleep 1
      }
    }
    stage('auto test') {
      steps {
        sleep 1
      }
    }
    stage('staging') {
      steps {
        sleep 1
      }
    }
  }
}