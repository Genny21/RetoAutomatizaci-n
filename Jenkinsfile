
pipeline {
    agent none
    
    stages {
        
        stage('Run Test') { 
            agent {
                docker {
                    image 'maven:3.6.3-jdk-11-slim' 
                    args '-v /opt/.m2:/root/.m2' 
                }
            }
            stages {
                
                stage('validate') {
                    steps { 
                        sh 'mvn clean verify'
                    }
                }
                
            }
        }

    }
    
}

