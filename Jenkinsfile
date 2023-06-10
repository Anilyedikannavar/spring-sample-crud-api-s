pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
                // Build Docker image
                sh 'docker build -t your-image-name .'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube Server Name') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
        stage('Deploy Docker Container') {
            steps {
                // Deploy Docker container
                sh 'docker run -d -p 8080:8080 --name your-container-name your-image-name'
            }
        }
        stage('Send Email') {
            steps {
                emailext (
                    subject: 'Build Status - ${currentBuild.result}',
                    body: '''Build Status: ${currentBuild.result}
                             Build URL: ${env.BUILD_URL}''',
                    recipientProviders: [[$class: 'CulpritsRecipientProvider']]
                )
            }
        }
    }
}











