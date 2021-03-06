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
                            url('https://gitlab.com/ot-client/central-team/ot-orchid-international/infrastructure.git')
                            credentials('opstree')
                            branch('EKS')
                        }
                    }
                }
            scriptPath('env/management/network/Jenkinsfile')
        }
    }
}