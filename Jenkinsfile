pipeline {
    agent any

    stages {
        stage('Get URL') {
            steps {
                script {   
                    git 'https://github.com/AlexandreFreitasCampos/ClaroMusicaAndroid.git'
                }
            }
        }
        
        stage('Testes Claro Musica') {
            steps {
                script {
                    bat 'mvn clean test'
                }
            }
        }
    }
}