pipeline {
    agent any

    stages {
        stage('Checar URL') {
            steps {
                git 'https://github.com/AlexandreFreitasCampos/ClaroMusicaAndroid.git'
            }
        }
        stage('Validar tela de permissões') {
            steps {
                bat 'mvn test -Dcucumber.features=src/test/resources/features/permissoes.feature'
            }
        }    
        stage('Validar a Landing Pages') {
            steps {
                bat 'mvn test -Dcucumber.features=src/test/resources/features/landing.feature'
            }
        }    
    }
}
