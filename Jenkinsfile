pipeline {
  environment {
    registry = "kashyaparchit/calculator"
    registryCredential = 'dockerhub'
    dockerImage = ''
  }
  agent any
  stages 
    {
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('DockerHub') {
        stages{
          stage('Build Image') {
            steps{
              script {
                dockerImage = docker.build registry + ":$BUILD_NUMBER"
              }
            }
          }
          stage('Push Image') {
            steps{
              script {
                docker.withRegistry( '', registryCredential ) {
                  dockerImage.push()
                }
              }
            }
          }
        }
    }
    stage('Deploy') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          options: """BUILD_VERSION=$BUILD_NUMBER""",
          jobId: "e1434470-304d-44d0-84c3-b2ea0111ccb7"])
        }
      }
    }
  }
}
