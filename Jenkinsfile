pipeline {
    agent any
    stages {
          stage('init') {
              when {
                  expression {
                      BRANCH_NAME == 'master'
                  }
              }
            steps {
                echo "start testing --- "
                }
            }
        }
        stage('build jar') {
            steps {
                when {
                  expression {
                      BRANCH_NAME == 'master'
                  }
              }
            steps {
                echo "start building "
            }
        }
        stage('build image') {
            when {
                  expression {
                      BRANCH_NAME == 'master'
                  }
              }
            
            steps {
                  echo "start building "
                }
            }
        stage('deploy') {
            when {
                  expression {
                      BRANCH_NAME == 'master'
                  }
              }
            steps {
               echo "start deploying ....." 
                }
            }
        }
    }
}
