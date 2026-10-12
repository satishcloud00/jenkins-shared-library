
def call() {
    stage('Build') {
        echo 'Building application'
    }

    stage('Test') {
        echo 'Testing application'
    }

    stage('Deploy') {
        echo 'Deploying application'
    }
}
