pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                sh 'git clone https://github.com/dimadolgov/GitHub-Commands.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Stage Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Stage Test'
            }
        }
        stage('Docker Build') {
            steps {
                echo 'Stage Docker Build'
            }
        }
        stage('Docker Push') {
            steps {
                echo 'Stage Docker Push'
            }
        }
    }
}
