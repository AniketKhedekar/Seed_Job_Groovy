multibranchPipelineJob('Multi_Job_Test') {
    branchSources {
        git {
            remote('https://github.com/AniketKhedekar/Multi_Branch_Workflow.git')
            credentialsId('github-ci')
            includes('JENKINS-*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
