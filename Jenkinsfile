#!/usr/bin/env groovy

library identifier: 'jenkins-shared-lib@master', retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'https://github.com/mohmawoed/Jenkins-Shared-Lib.git',
         credentialsId: 'github-credentials'
        ]
)


pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("build jar") {
            steps {
                script {
                        echo "test webhook"
                    buildJar()
                }
            }
        }
        stage("build  image") {
            steps {
                script {
                    buildImage 'mohmawoed/demo-app:jma2.0'
                    dockerLogin()
                    dockerPush 'mohmawoed/demo-app:jma2.0'

                }
            }
        }
    }
}
