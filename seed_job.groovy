multibranchPipelineJob('Multi_Job_Test') {
    branchSources {
        git {
            remote('https://github.com/AniketKhedekar/Multi_Branch_Workflow.git')
          
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
