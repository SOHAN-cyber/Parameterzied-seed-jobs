folder ('INFRA')
pipelineJob('INFRA/SingleNetworkSetupJob') {
    definition {
        cpsScm {
                scm {
                    git {
                        remote{
                            name('origin')
                            url('https://github.com/SOHAN-cyber/Parameterzied-seed-jobs.git')
                            credentials('github')
                            branch('main')
                        }
                    }
                }
            scriptPath('Jenkinsfile')
        }
    }
}