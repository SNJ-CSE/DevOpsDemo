pipeline{
	agent any	
	stages{
		stage("build")
		{
		  steps{echo "Testing the pipiline"
			bat "java -version"
			}
		}
		stage("Veirfy")
		{
		  steps{echo "Verify the pipiline"
			bat "mvn -version"
			}
		}
		
	      }

}
