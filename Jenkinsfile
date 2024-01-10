pipeline {
    agent any
    stages{
        stage('testing'){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo "testing the app ......."
            }
        }
        stage('build'){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo "building the app ......."
            }
        }
        stage('deploy'){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo "deploy the app ......."
            }
        }
        
    }
    }
