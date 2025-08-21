pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'hello'
            }
        }
        stage('create folder') {
            steps {
                bat '''
                    mkdir -p test
                    echo folder created
                ''' 
            }
        }
    }
}
