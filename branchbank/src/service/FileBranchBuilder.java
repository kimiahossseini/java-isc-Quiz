package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import model.Branch;

public class FileBranchBuilder implements BranchBuilder {
	private static final Logger logger=Logger.getLogger(FileBranchBuilder.class.getName());
    
	//--------------create branch set from filelines-------------------------------------
	@Override
	public Set<Branch> build() throws BranchBuildException {
		Set<Branch> branchset=new HashSet<>();
		List<String> branchstring=ReadFile("branches.txt");
		branchstring.forEach(t -> {String[] element=t.split(";");
							Branch branch=new Branch(element[0], element[1], element[2], element[3]);
							branchset.add(branch);});
		
		
		//formater for print {%d for number} {%n nextline} {%s for string}---------------
		System.out.printf("Total %d branch(s) found.%nObject(s) are ready:%n %s", 
				branchset.size(), branchset);
		return branchset;
	}
	
	//------------------------read file------------------return fileLines---------
	public static List<String> ReadFile(String filepath) throws BranchBuildException{
		List<String> fileLines=new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
			String Line;
			while ((Line = reader.readLine()) != null) {
				logger.info("line readed: " + Line);
				fileLines.add(Line);
				
			}
		} catch (IOException e) {
			logger.severe("Could not find file " + filepath);
			throw new BranchBuildException("we couldn't read your file", e);
		}
		return fileLines;
		
	}
	

}
