pipeline {
    agent any 
    stages {
        stage("BUILD"){
            steps{
                sh 'echo "test"'
                sh 'docker --version'
                sh 'docker run hello-world'
            }
        }
    }
}