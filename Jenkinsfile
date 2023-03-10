pipeline {
    agent any 
    stages {
        stage("BUILD"){
            steps{
                sh 'cd /var/lib/jenkins/workspace/ToDo/Java/todo/target'
                sh 'java -cp todo-cool.jar de.telekom.App' 
            }
        }
    }
}
