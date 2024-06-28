pipeline {
    agent any
    options {
        disableConcurrentBuilds() // Garante que apenas um estágio é executado por vez
    }
    
    stages {
        stage('Checar URL') {
            steps {
                git 'https://github.com/AlexandreFreitasCampos/IRP.git'
            }
        }
        stage('Realizar login com o perfil Editor and Recorder') {
            steps {
                bat 'mvn test -Dcucumber.filter.tags="@recEditor"'
            }
        }
        stage('Gerar relatorios personalizados todos os filtros com o perfil Editor and Recorder') {
            steps {
                bat 'mvn test -Dcucumber.filter.tags="@faixas"'
            }
        }
        stage('Realizar login com o perfil Recorder') {
            steps {
                bat 'mvn test -Dcucumber.filter.tags="@recEditor"'
            }
        }
        stage('Gerar relatorios personalizados todos os filtros com o perfil Recorder') {
            steps {
                bat 'mvn test -Dcucumber.filter.tags="@faixasRec"'
            }
        }
    }    
}