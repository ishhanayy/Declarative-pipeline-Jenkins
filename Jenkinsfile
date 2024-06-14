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
          input("Do you want the result ?")
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts 'target/*.jar'
    }
}
}