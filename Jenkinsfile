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
        bat 'mvn install'
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
        /* sshPublisher(publishers: [sshPublisherDesc(configName: '164', transfers: [sshTransfer(excludes: '', execCommand: '''cp /root/root/target/webtest.war /opt/resin_atp_server/webapps/
/opt/resin_atp_server/bin/resin.sh stop
/opt/resin_atp_server/bin/resin.sh start''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: 'target/webtest.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)]) */
      }
    }
    stage('staging') {
      steps {
        sleep 1
      }
    }
  }
}
