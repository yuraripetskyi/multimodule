pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr:'5'))
    }
    triggers {
        pollSCM('H */1 * * *');
        upstream(upstreamProjects: "smart-apps-exchange-stream pipeline/" + env.BRANCH_NAME.replaceAll("/", "%2F"), threshold: hudson.model.Result.SUCCESS)
    }
    tools {
        jdk 'Java 1.8 Oracle'
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