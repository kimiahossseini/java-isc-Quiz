package service;

public class BranchesApp {

	public static void main(String[] args) throws BranchBuildException {
		BranchBuilder branchBuilder = new FileBranchBuilder();
		branchBuilder.build();

	}

}
