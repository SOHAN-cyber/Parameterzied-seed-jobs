pipeline {
    agent any
        stages {
            stage ('Network') {
                when {
                    expression {
                        Network == 'True'
                    }
                }
                   environment {
                       AWS_ACCESS_KEY_ID = credentials('AWS')
                       AWS_SECRET_ACCESS_KEY = credentials('AWS')
                    }
                steps {
                     dir ('env/management/network') {
                         sh 'export AWS_ACCESS_KEY="$AWS_ACCESS_KEY_ID"'
                         sh 'export AWS_SECRET_ACCESS_KEY="$AWS_SECRET_ACCESS_KEY"'
                         sh ' export AWS_REGION=ap-south-1'
                          sh 'terraform init'
                          sh 'terraform plan'
                          sh 'terraform validate'
                          sh 'terraform plan'
                          sh 'terraform apply'
                        }
                }
            }
        }
}