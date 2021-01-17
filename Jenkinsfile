pipeline {

    agent {
            label  'maven'
        }

    // using the Timestamper plugin we can add timestamps to the console log
    options {
        timestamps()
    }

    environment {

    }

    stages {
        stage('Build') {
        withMaven {
            clean install
        }
      }
    }

    post {
        failure {
            // notify users when the Pipeline fails
           // mail to: 'team@example.com',
            //        subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             //       body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}