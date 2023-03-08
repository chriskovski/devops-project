pipeline {
    agent any 
    stages {
        stage("BUILD"){
            steps{
                sh 'echo "test"'
                sh 'docker --version'
                sh 'sudo docker run hello-world'
            }
        }
    }
}
