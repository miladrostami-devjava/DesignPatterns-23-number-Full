package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class VersionControlSystem {
List<Commit> commits = new ArrayList<>();

public void push(Commit commit){
    commits.add(commit);
}

public Commit pull(int index){
 return    commits.get(index);
}






}
