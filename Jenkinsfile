pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                echo 'Cleaning..'
                sh './gradlew clean'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew pipelineBuild'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing....'
                sh './gradlew test'
            }
        }
    }
}
