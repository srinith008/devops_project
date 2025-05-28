pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/srinith008/devops_project.git'
            }
        }

        stage('Start Local Server') {
            steps {
                script {
                    bat 'python -m http.server 8080'
                }
            }
        }
    }
}
