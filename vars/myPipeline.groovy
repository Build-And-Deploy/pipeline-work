
def call() {
    pipeline {
        agent any

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
                    echo "docker ps"
                }
            }
        }
    }
}
