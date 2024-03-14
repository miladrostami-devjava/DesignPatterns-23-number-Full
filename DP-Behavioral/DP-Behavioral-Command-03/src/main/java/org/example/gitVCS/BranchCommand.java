package org.example.gitVCS;

public class BranchCommand implements Command{
    private final VersionControlSystem vcs;
    private final String name;

    public BranchCommand(VersionControlSystem vcs, String name) {
        this.vcs = vcs;
        this.name = name;
    }


    @Override
    public void execute() {
        vcs.createBranch(name);
    }

    @Override
    public void undo() {
        vcs.deleteBranch(name);
    }
}
