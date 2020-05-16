pipeline {
    stage('Clean') {
        steps {
            sh 'mvn clean'
        }
    }
    stage('Complie') {
        steps {
            sh 'mvn compile'
        }
    }
    stage('Test') {
        steps {
            sh 'mvn test'
        }
    }
}