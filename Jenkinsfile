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
			bat "date"
			}
		}
		stage("Print")
		{
		  steps{echo "Print stage"
			bat "java -version"
			bat "time"
			}
		}
	      }

}
