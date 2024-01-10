pipeline {
    agent any
    stages{
        stage('testing'){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            setps {
                echo "testing the app ......."
            }
        }
        stage('build'){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            setps {
                echo "building the app ......."
            }
        }
        stage('deploy'){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            setps {
                echo "deploy the app ......."
            }
        }
        
    }
    }
