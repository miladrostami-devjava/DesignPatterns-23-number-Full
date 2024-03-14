package org.example;

import org.example.gitVCS.BranchCommand;
import org.example.gitVCS.CommitChange;
import org.example.gitVCS.Developer;
import org.example.gitVCS.VersionControlSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VersionControlSystem vcs = new VersionControlSystem();
        Developer javaDeveloper = new Developer();

        javaDeveloper.executeCommands(new BranchCommand(vcs,"milad"));
        javaDeveloper.executeCommands(new CommitChange(vcs));

        javaDeveloper.undoLastCommand();
        javaDeveloper.undoLastCommand();


    }
}
