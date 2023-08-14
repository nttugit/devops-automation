pipeline {
    agent any
    tools {
        maven 'maven_3_5_0'
    }
    stages {
        stage('Build Maven'){
            steps {
                git branch: 'main', url: 'https://github.com/nttugit/devops-automation'
                bat 'mvn clean install'
            }
        }
        stage('Build docker image') {
            steps {
                script {
                    bat 'docker build -t nicenguyen/devops-integration .'
                }
            }
        }
        stage ('Push image to Hub') {
            steps {
                script {
                    bat 'docker push nicenguyen/devops-integration'
                }

            }
        }
    }

}