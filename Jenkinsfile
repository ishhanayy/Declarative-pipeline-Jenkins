pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat "mvn test"

            }
        }
        stage('Package') {
            steps {
                echo 'Packaging....'
                bat "mvn package"

            }
        }
        stage('Result'){
          steps{
            input("Do you want the result ?")
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
          }
    }
    stage('Email building stage'){
        steps{
            mail bcc: '', body: '''Hello Eclairs,
The declarative pipeline is being build

Regards,
Jenkins Admin''', cc: '', from: '', replyTo: '', subject: 'Remarks of Jenkins Learning', to: 'ishanimalviya333@gmail.com'
        }
    }
}
}