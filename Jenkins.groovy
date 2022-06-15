folder('INFRA')
pipelineJob('INFRA/SingleNetworkSetupJob') {
    definition {
        cpsScm {
                scm {
                    git {
                        remote {
                            name('origin')
                            url('https://gitlab.com/ot-client/central-team/ot-orchid-international/infrastructure.git')
                            credentials('opstree')
                            branch('main')
                        }
                    }
                }
            scriptPath('Jenkinsfile')
        }
    }
}