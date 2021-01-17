pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
             if (env.BUILDING_TOOL == 'maven') {
                            sh 'mvn clean package'
                        } else {
                             sh 'gradlew clean build'
                        }
        }
        stage('Test') {
            if (env.BUILDING_TOOL == 'maven') {
                                        sh 'mvn clean test'
                                    } else {
                                         sh './gradlew clean test'
                                    }
        }
        stage('Deploy') {
                    steps {
                        echo 'Deploying....'
                    }
                }
    }
}
