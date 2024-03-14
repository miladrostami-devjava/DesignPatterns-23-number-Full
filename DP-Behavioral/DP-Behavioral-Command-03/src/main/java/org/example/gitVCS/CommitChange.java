package org.example.gitVCS;

public class CommitChange implements Command{
    private final VersionControlSystem vcs;

    public CommitChange(VersionControlSystem vcs) {
        this.vcs = vcs;
    }


    @Override
    public void execute() {
        vcs.commitChanges();
    }

    @Override
    public void undo() {
vcs.rollBackChanges();
    }
}
