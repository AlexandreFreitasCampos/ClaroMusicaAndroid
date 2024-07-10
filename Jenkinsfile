pipeline {
    agent any

    stages {
        stage('Checar URL') {
            steps {
                git 'https://github.com/AlexandreFreitasCampos/ClaroMusicaAndroid.git'
            }
        }
        stage('Regressivo Claro Musica') {
            steps {
                bat 'mvn clean test'
            }
        }       
    }
}
