
def call() {
    pipeline {
        agent {
            docker {
                image 'docker:24.0-cli'
                args '-v /var/run/docker.sock:/var/run/docker.sock'
            }
        }

        stages {
            
            stage('Print') {
                steps {
                    echo "Pipeline running.."
                }
            }

            stage('PWD') {
                steps {
                    sh "pwd"
                }
            }

            stage('Test Docker') {
                steps {
                    sh "docker ps"
                }
            }
        }
    }
}
