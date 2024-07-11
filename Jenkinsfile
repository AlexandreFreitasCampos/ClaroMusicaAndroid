pipeline {
    agent any

    stages {
        stage('Job 1 - Validar Permissões') {
            steps {
                script {
                    // Aqui você pode definir os passos específicos para o Job 1
                    git 'https://github.com/AlexandreFreitasCampos/ClaroMusicaAndroid.git'
                    bat 'mvn test -Dcucumber.features=src/test/resources/features/permissoes.feature'
                }
            }
        }
        
        stage('Job 2 - Validar Landing Pages') {
            steps {
                script {
                    // Aqui você pode definir os passos específicos para o Job 2
                    git 'https://github.com/AlexandreFreitasCampos/ClaroMusicaAndroid.git'
                    bat 'mvn test -Dcucumber.features=src/test/resources/features/landing.feature'
                }
            }
        }
    }
}