pipeline {
    agent any 
    stages {
        stage("TEST"){
            steps{
                sh 'echo "test"'
                sh 'docker --version'
                sh 'docker run hello-world'
            }
        }
    }
}