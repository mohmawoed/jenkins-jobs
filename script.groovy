def buildJar() {
  echo "Building the application...."
  sh 'mvn package'
}
def buildImage(){
  echo "Building images."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build -t  mohmawoed/demo-app:jma2.0 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push mohmawoed/demo-app:jma2.0'
}

def deployApp(){
  echo "deploying the application"
}
return this
