pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/YOUR_USERNAME/java-cicd-sample.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying... (You can integrate actual deployment here)'
            }
        }
    }
}
