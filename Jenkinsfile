pipeline {
    agent none
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('build jar') {
            steps {
                script {
                    echo "Building the application..."
                    sh 'mvn packages'
                }
            }
        }
        stage('build image') {
            steps {
                script {
                    echo "Building images."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build -t  mohmawoed/demo-app:jma2.0 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push mohmawoed/demo-app:jma2.0'

                    }

                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}
