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
			        
			        junit '**/target/surefire-reports/Testng-*.xml'
			    }   
			}
		}		
}