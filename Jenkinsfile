pipeline{
	agent any
	tools{ 
		maven 'MAVEN'
		jdk 'JDK'
	}
		stages{
			stage('checkout'){
				steps {
					git 'https://github.com/Leeper07/jenkinsCucumberAssign.git'
				}
			}
			
			stage('build'){
				steps {
					bat 'mvn clean compile'
				}
			}
			
			stage('test'){
			    steps{
			        bat 'mvn test'
			        
			        junit '**/target/cucumber-reports/Cucumber.xml'
			    }   
			}
			
			stage('Deploy') {
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' 
              }
            }
            steps {
                sh 'make publish'
            }
        }
		}		
}