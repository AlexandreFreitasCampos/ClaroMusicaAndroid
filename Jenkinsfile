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
        
        stage('Permissoes') {
            steps {
                script {
                    bat 'mvn test -Dtest=Permissoes'
                }
            }
        }
        stage('Landing') {
            steps {
                script {
                    bat 'mvn test -Dtest=Landing'
                }
            }
        }
    }
}