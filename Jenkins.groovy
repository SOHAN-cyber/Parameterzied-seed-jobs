folder ('INFRA')
pipelineJob('INFRA/SingleNetworkSetupJob') {
    parameters {
        choiceParam('Network', ['True', 'False'])
    }
    definition {
        cpsScm {
                scm {
                    git {
                        remote{
                            name('origin')
                            url('https://github.com/SOHAN-cyber/Parameterzied-seed-jobs.git')
                            credentials('github')
                            branch('master')
                        }
                    }
                }
            scriptPath('Jenkinsfile')
        }
    }
}