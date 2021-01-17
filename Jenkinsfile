pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr:'5'))
    }
    triggers {}
    tools {
        jdk 'Java 1.11 Oracle'
        maven 'Maven 3.3.9'
    }
    stages {
        stage('build & docker :dev') {
            when {
                branch 'dev'
            }
            steps {
                sh 'mvn clean install'
            }
        }
    }
    post {
        always {
            script {

                if (currentBuild.result == null) {
                    currentBuild.result = 'SUCCESS'
                }
            }
            alwaysNotifications()
        }
        failure {
            failureNotifications()
        }
    }
}