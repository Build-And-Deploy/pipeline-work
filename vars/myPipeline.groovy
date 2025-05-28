
def call() {
    pipeline {
        agent any

        stages {
            
            stage('Print') {
                steps {
                    echo "Pipeline running.."
                }
            }
        }
    }
}