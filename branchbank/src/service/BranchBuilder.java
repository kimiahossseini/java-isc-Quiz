package service;

import java.util.Set;
import model.Branch;

public interface BranchBuilder {
	Set<Branch> build() throws BranchBuildException;
}
