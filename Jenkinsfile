pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/srinith008/devops_project.git'
            }
        }

        stage('Start Local Server') {
            steps {
                echo '🎉 Local server started (example step)...'
                // Add your actual HTML/JS server logic here
            }
        }
    }
}
