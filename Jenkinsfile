
JENKINS_HOME="/var/jenkins_home/workspace"

pipeline {

    agent any

    stages {

        stage ( 'Build') {
            steps {
                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn clean package'
                }
            }
        }

        stage ( 'Deploy') {
            steps {
                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : 'PCF_LOGIN',
                                  usernameVariable: 'USERNAME',
                                  passwordVariable: 'PASSWORD']]) {
                    sh "${JENKINS_HOME}/myapp-jenkins-example_master/cf login -a https://api.run.pivotal.io -u ${USERNAME} -p ${PASSWORD}"
                    sh "${JENKINS_HOME}/myapp-jenkins-example_master/cf push"
                }
            }
        }
    }
}
